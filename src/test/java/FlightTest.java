import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Flight flightPanam103;
    Pilot pilotRaymond;
    CabinCrewMember cabinCrewMemberDolly;
    Passenger passengerBob;
    Passenger passengerBill;

    ArrayList<Crew> crewList;
    ArrayList<Passenger> passengerList;


    @Before
    public void before() {
        pilotRaymond = new Pilot("Raymond", RankType.CAPTAIN, "3476");
        cabinCrewMemberDolly = new CabinCrewMember("Dolly", RankType.FLIGHTATTENDANT);
        passengerBob = new Passenger("Bob", 2);
        passengerBill = new Passenger("Bill", 3);
        crewList = new ArrayList<>();
        passengerList = new ArrayList<>();
        crewList.add(pilotRaymond);
        crewList.add(cabinCrewMemberDolly);
        flightPanam103 = new Flight(crewList,
                passengerList,
                PlaneType.AIRBUSA380,
                "103",
                "MAD",
                "EDI",
                "06:00");
    }

    @Test
    public void hasPilot() {
        assertTrue(flightPanam103.checkIfHasPilot());
    }
    @Test
    public void hasEmptyPassengerList(){
        assertEquals(0, flightPanam103.getNumberOfPassengersOnFlight());
    }
    @Test
    public void hasPlane(){
        assertEquals(PlaneType.AIRBUSA380, flightPanam103.getPlane());
    }
    @Test
    public void hasFlightNumber(){
        assertEquals("103", flightPanam103.getFlightNumber());
    }
    @Test
    public void hasDestination(){
        assertEquals("MAD", flightPanam103.getDestination());
    }
    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flightPanam103.getDepartureAirport());
    }
    @Test
    public void hasDepartureTime(){
        assertEquals("06:00", flightPanam103.getDepartureTime());
    }
    @Test
    public void hasAvailableSeats(){
        flightPanam103.addPassengerToFlight(passengerBob);
        assertEquals(699, flightPanam103.getNumberOfSeatsLeft());
    }
}
