import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Very Important Business Man",2);
    }

    @Test
    public void hasName(){
        assertEquals("Very Important Business Man", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2,passenger.getNumberOfBags());
    }

}

