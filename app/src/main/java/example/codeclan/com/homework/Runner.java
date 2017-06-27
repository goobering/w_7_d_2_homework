package example.codeclan.com.homework;

import java.util.ArrayList;

/**
 * Created by user on 27/06/2017.
 */

public class Runner
{
    public static void main(String[] args)
    {
        Boxer boxer1 = new Boxer("Alice", 100, 1);
        Boxer boxer2 = new Boxer("Bob", 2, 2);

        Event event = new Event();
        event.addParticipant(boxer1);
        event.addParticipant(boxer2);

        ScreenLogger screenLogger = new ScreenLogger();

        for(ArrayList<String> athleteResult : event.runEvent())
        {
            for(String result : athleteResult)
            {
                screenLogger.printLine(result);
            }
        }

        ILogger logger = new ScreenLogger();
        int loggerChoice = 0;

        String question = "Would you like to output to:";
        ArrayList<String> optionList = new ArrayList<String>();
        optionList.add("The screen");
        optionList.add("A file");

        loggerChoice = UI.getNumberedChoice(question, optionList);

        if(loggerChoice == 2)
        {
            logger = new FileLogger();
        }

        for(int i = 1; i < 4; i++)
        {
            boxer1.setDistanceRunLatest(i * 10);
            boxer1.updateDistanceRunTotal();
            logger.printLine(String.format("%s just ran %d unspecified distance units.", boxer1.getName(), boxer1.getDistanceRunLatest()));
            logger.printLine(String.format("%s has run %d unspecified distance units in total.", boxer1.getName(), boxer1.getDistanceRunTotal()));
            logger.printLine("");
        }
    }
}