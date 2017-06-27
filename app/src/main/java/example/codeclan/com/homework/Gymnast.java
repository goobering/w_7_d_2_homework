package example.codeclan.com.homework;

/**
 * Created by user on 27/06/2017.
 */

public class Gymnast extends Athlete
{
    private int difficultyPoints, executionPoints;

    public Gymnast(String name, int difficultyPoints, int executionPoints)
    {
        super(name);
        this.difficultyPoints = difficultyPoints;
        this.executionPoints = executionPoints;
    }

    public int calculatePoints()
    {
        return difficultyPoints + executionPoints;
    }
}
