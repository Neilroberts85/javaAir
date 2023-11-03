import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Raymond","Captain", "3476");
    }

    @Test
    public void hasName(){
        assertEquals("Raymond", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Captain",pilot.getRank());
    }

    @Test
    public void hasPilotLicenseNumber(){
        assertEquals("3476", pilot.getPilotLicenseNumber());
    }

}
