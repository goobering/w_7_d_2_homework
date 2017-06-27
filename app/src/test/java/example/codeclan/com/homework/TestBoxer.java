package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class TestBoxer
{
    Boxer boxer;

    @Before
    public void before()
    {
        boxer = new Boxer("Alice", 1, 1);
    }

    @Test
    public void testCalculatePoints()
    {
        assertEquals(0, boxer.calculatePoints());
    }

    @Test
    public void testCalculatePointsNegative()
    {
        boxer = new Boxer("Alice", 0, 50);
        assertEquals(-50, boxer.calculatePoints());
    }
}
