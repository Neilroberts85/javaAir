import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flightPanam103;
    ArrayList<Crew> crewList;
    ArrayList<Passenger> passengerList;

    @Before
    public void before(){

        passenger = new Passenger("Very Important Business Man",2);
        crewList = new ArrayList<>();
        passengerList = new ArrayList<>();
    }

    @Test
    public void hasName(){
        assertEquals("Very Important Business Man", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2,passenger.getNumberOfBags());
    }

    @Test
    public void hasFlight(){

        flightPanam103 = new Flight(crewList, passengerList, PlaneType.AIRBUSA380, "5345","MAD","EDI", "06:30");
        flightPanam103.addPassengerToFlight(passenger);
        assertEquals(flightPanam103, passenger.getFlight());
    }

    @Test
    public void hasSeatNumber(){
        flightPanam103 = new Flight(crewList, passengerList, PlaneType.AIRBUSA380, "5345","MAD","EDI", "06:30");
        flightPanam103.addPassengerToFlight(passenger);
        // need to add way of checking for random number
        assertEquals(200, passenger.getSeatNumber());
    }
}

