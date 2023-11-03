import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Raymond",RankType.CAPTAIN, "3476");
    }

    @Test
    public void hasName(){
        assertEquals("Raymond", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Captain",pilot.getRankType().getRank());
    }

    @Test
    public void hasPilotLicenseNumber(){
        assertEquals("3476", pilot.getPilotLicenseNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("My name is Raymond and I will be your Captain", pilot.flyPlane());
    }
}

