package example.codeclan.com.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 27/06/2017.
 */

public class FileLogger implements ILogger
{
    public FileLogger()
    {

    }

    public void printLine(String string)
    {
        File file = new File ("/file.txt");
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("file.txt"), true));
            printWriter.println (string);
            printWriter.close ();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("PROBLEM");
        }
    }

    public void print(String string)
    {
        File file = new File ("/file.txt");
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("file.txt"), true));
            printWriter.print(string);
            printWriter.close ();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("PROBLEM");
        }
    }
}
