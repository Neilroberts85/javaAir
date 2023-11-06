import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flightPanam103;
    Pilot pilotRaymond;
    CabinCrewMember cabinCrewMemberDolly;
    Passenger passengerPaul;
    Passenger passengerPeter;

    ArrayList<Crew> crewList;
    ArrayList<Passenger> passengerList;

    @Before
    public void before(){
        pilotRaymond = new Pilot("Raymond", RankType.CAPTAIN, "3476");
        cabinCrewMemberDolly = new CabinCrewMember("Dolly", RankType.FLIGHTATTENDANT);
        passengerPaul = new Passenger("Paul", 2);
        passengerPeter = new Passenger("Peter", 3);
        crewList = new ArrayList<>();
        passengerList = new ArrayList<>();
        crewList.add(pilotRaymond);
        crewList.add(cabinCrewMemberDolly);
        passengerList.add(passengerPeter);
        passengerList.add(passengerPaul);
        flightPanam103 = new Flight(crewList,
                passengerList,
                PlaneType.AIRBUSA380,
                "103",
                "MAD",
                "EDI",
                "06:00");
        flightManager = new FlightManager(flightPanam103);
    }


    @Test
    public void hasBaggageWeightPerPassenger(){
        assertEquals(857, flightManager.baggageWeightPerPassenger());
    }

    @Test
    public void hasBaggageWeightOfBookedPassengers(){
        assertEquals(1714, flightManager.getBaggageWeightBooked());
    }

    @Test
    public void hasAvailableBaggageWeightLeft(){
        assertEquals(598286, flightManager.getBaggageWeightRemaining());
    }


}
