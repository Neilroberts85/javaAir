import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flightPanam103;
    Pilot pilotRaymond;
    CabinCrewMember cabinCrewMemberDolly;
    Passenger passengerBob;
    Passenger passengerBill;

    ArrayList<Pilot> pilotList;
    ArrayList<CabinCrewMember> cabinCrew;
    ArrayList<Passenger> passengerList;




    @Before
    public void before(){
        pilotRaymond = new Pilot("Raymond",RankType.CAPTAIN, "3476");
        cabinCrewMemberDolly = new CabinCrewMember("Dolly",RankType.FLIGHTATTENDANT);
        passengerBob = new Passenger("Bob",2);
        passengerBill = new Passenger("Bill",3);

        pilotList = new ArrayList<>();
        cabinCrew = new ArrayList<>();
        passengerList = new ArrayList<>();

        pilotList.add(pilotRaymond);
        cabinCrew.add(cabinCrewMemberDolly);
        passengerList.add(passengerBob);
        flightPanam103 = new Flight(pilotList,
                                    cabinCrew,
                                    passengerList,
                                    PlaneType.AIRBUSA380,
                                    "103",
                                    "MAD",
                                    "EDI",
                                    "06:00");
    }
    @Test
    public void hasPilot(){
        assertEquals(1, flightPanam103.getNumberOfPilots());
    }
    @Test
    public void has
}
