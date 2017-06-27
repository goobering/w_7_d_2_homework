package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class TestAthlete
{
    Athlete boxer;

    @Before
    public void before()
    {
        boxer = new Boxer("Alice", 1, 1);
    }

    @Test
    public void testupdateDistanceRunTotal()
    {
        assertEquals(0, boxer.getDistanceRunTotal());
        boxer.setDistanceRunLatest(10);
        boxer.updateDistanceRunTotal();
        assertEquals(10, boxer.getDistanceRunTotal());
    }

    @Test
    public void testPrepare()
    {
        assertEquals("Prepared!", boxer.prepare());
    }

    @Test
    public void testCompete()
    {
        assertEquals("Competed!", boxer.compete());
    }

    @Test
    public void testAwardMedalNone()
    {
        assertEquals("No medal!", boxer.awardMedal(1));
    }

    @Test
    public void testAwardMedalBronze()
    {
        assertEquals("Bronze", boxer.awardMedal(5));
    }

    @Test
    public void testAwardMedalSilver()
    {
        assertEquals("Silver", boxer.awardMedal(10));
    }

    @Test
    public void testAwardMedalGold()
    {
        assertEquals("Gold", boxer.awardMedal(1000));
    }
}
