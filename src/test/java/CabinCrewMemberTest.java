import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Dolly","Head Stewardess");
    }

    @Test
    public void hasName(){
        assertEquals("Dolly", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Head Stewardess",cabinCrewMember.getRank());
    }

}
