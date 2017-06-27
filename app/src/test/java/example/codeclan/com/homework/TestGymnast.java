package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class TestGymnast
{
    Gymnast gymnast;

    @Before
    public void before()
    {
        gymnast = new Gymnast("Alice", 1, 1);
    }

    @Test
    public void testCalculatePoints()
    {
        assertEquals(2, gymnast.calculatePoints());
    }
}
