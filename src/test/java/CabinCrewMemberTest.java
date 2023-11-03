import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Dolly",RankType.FLIGHTATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Dolly", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Flight Attendant",cabinCrewMember.getRankType().getRank());
    }

    @Test
    public void canSpeak(){
        assertEquals("Hello, Im Dolly and ill be your Flight Attendant", cabinCrewMember.speak());
    }
}
