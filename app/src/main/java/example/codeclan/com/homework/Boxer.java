package example.codeclan.com.homework;

/**
 * Created by user on 27/06/2017.
 */

public class Boxer extends Athlete
{
    int hitsGiven, hitsTaken;

    public Boxer(String name, int hitsGiven, int hitsTaken)
    {
        super(name);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public int calculatePoints()
    {
        return hitsGiven - hitsTaken;
    }
}
