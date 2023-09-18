import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.CREATE;
import javax.swing.JFileChooser;

public class PersonReader
{

    public static void main(String[] args)
    {

        JFileChooser chooser = new JFileChooser();
        File chosenFile;
        String rec = "";

        try
        {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                System.out.printf("%-15s%-20s%-20s%-20s%-20s", "ID#", "firstName", "lastName", "Title", "YOB");
                System.out.println("\n===============================================================================");
                chosenFile = chooser.getSelectedFile();
                Path file = chosenFile.toPath();
                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));
                while(reader.ready())
                {
                    rec = reader.readLine();
                    String[] information = rec.split(", ");
                    System.out.printf("\n%-15s%-20s%-20s%-20s%-20s", information [0], information [1], information [2], information [3], information [4]);
                }
                reader.close();
                System.out.println("\n\nData file read!");
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Try Again, File Not Found!!!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

}