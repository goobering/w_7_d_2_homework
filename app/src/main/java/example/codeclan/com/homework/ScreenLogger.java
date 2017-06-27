package example.codeclan.com.homework;

import java.util.ArrayList;

/**
 * Created by user on 27/06/2017.
 */

public class ScreenLogger implements ILogger
{
    public ScreenLogger()
    {

    }

    public void printLine(String string)
    {
        System.out.println(string);
    }

    public void print(String string)
    {
        System.out.print(string);
    }
}
