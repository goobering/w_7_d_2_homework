package example.codeclan.com.homework;

import java.util.ArrayList;

/**
 * Created by user on 27/06/2017.
 */

public class Event
{
    private ArrayList<Athlete> participants;

    public Event()
    {
        participants = new ArrayList<Athlete>();
    }

    public void addParticipant(Athlete participant)
    {
        participants.add(participant);
    }

    public ArrayList<Athlete> getParticipants()
    {
        return participants;
    }

    //Wheeeeeeee
    public ArrayList<ArrayList<String>> runEvent()
    {
        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();

        for(Athlete participant : participants)
        {
            results.add(runEventForAthlete(participant));
        }

        return results;
    }

    private ArrayList<String> runEventForAthlete(Athlete athlete)
    {
        ArrayList<String> results = new ArrayList<String>();

        results.add(String.format("%s: %s", athlete.getName(), athlete.prepare()));
        results.add(String.format("%s: %s", athlete.getName(), athlete.compete()));
        results.add(String.format("%s: Scored %d points", athlete.getName(), athlete.calculatePoints()));
        results.add(String.format("%s: Medal: %s", athlete.getName(), athlete.awardMedal(athlete.calculatePoints())));
        results.add("");

        return results;
    }
}
