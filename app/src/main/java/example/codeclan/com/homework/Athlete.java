package example.codeclan.com.homework;

/**
 * Created by user on 27/06/2017.
 */

public abstract class Athlete
{
    private int distanceRunTotal = 0;
    private int distanceRunLatest = 0;
    private String name;

    public Athlete(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getDistanceRunLatest()
    {
        return distanceRunLatest;
    }

    public void setDistanceRunLatest(int distanceRunLatest)
    {
        this.distanceRunLatest = distanceRunLatest;
    }

    public void updateDistanceRunTotal()
    {
        distanceRunTotal += distanceRunLatest;
    }

    public int getDistanceRunTotal()
    {
        return distanceRunTotal;
    }

    public String prepare()
    {
        return "Prepared!";
    }

    public String compete()
    {
        return "Competed!";
    }

    public String awardMedal(int points)
    {
        String medal = "No medal!";

        if(5 <= points && points <= 9)
        {
            medal = "Bronze";
        }
        else if(10 <= points && points <= 14)
        {
            medal = "Silver";
        }
        else if(15 <= points)
        {
            medal = "Gold";
        }

        return medal;
    }

    public abstract int calculatePoints();
}
