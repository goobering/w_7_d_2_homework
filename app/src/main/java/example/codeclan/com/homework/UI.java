package example.codeclan.com.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by user on 27/06/2017.
 */

public class UI
{
    public static int getNumberedChoice(String question, ArrayList<String> options)
    {
        int selection = 0;
        ILogger screenLogger = new ScreenLogger();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            if(selection >= 1 && selection <= options.size())
            {
                break;
            }

            screenLogger.printLine(question);
            for(String option : options)
            {
                screenLogger.printLine(String.format("%d: %s", options.indexOf(option) + 1, option));
            }
            screenLogger.print("> ");

            try
            {
                selection = sc.nextInt();
            }
            catch(InputMismatchException ex)
            {
                screenLogger.printLine("Please input a number from the menu.");
            }
            catch(IllegalStateException ex)
            {
                screenLogger.printLine("Something very, very bad has happened. Shutting down.");
                System.exit(0);
            }
        }

        return selection;
    }
}