package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class TestEvent
{
    Event event;
    Athlete athlete1;
    Athlete athlete2;

    @Before
    public void before()
    {
        event = new Event();
        athlete1 = new Boxer("Alice", 1, 1);
        athlete2 = new Boxer("Bob", 2, 2);
    }

    @Test
    public void testAddParticipant()
    {
        assertEquals(0, event.getParticipants().size());
        event.addParticipant(athlete1);
        assertEquals(1, event.getParticipants().size());
        assertEquals(athlete1, event.getParticipants().get(0));
    }

    @Test
    public void testRunEventForOne()
    {
        event.addParticipant(athlete1);
        ArrayList<ArrayList<String>> result = event.runEvent();
        assertEquals(1, result.size());
        assertEquals(5, result.get(0).size());
        assertEquals("Alice: Prepared!", result.get(0).get(0));
        assertEquals("Alice: Competed!", result.get(0).get(1));
        assertEquals("Alice: Scored 0 points", result.get(0).get(2));
        assertEquals("Alice: Medal: No medal!", result.get(0).get(3));
        assertEquals("", result.get(0).get(4));
    }
}
