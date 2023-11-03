import org.junit.Before;

public class FlightTest {

    Flight flightPanam103;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger;
    @Before
    public void before(){
        pilot = new Pilot("Raymond","Captain", "3476");
        cabinCrewMember = new CabinCrewMember("Dolly","Head Stewardess");
        passenger = new Passenger("Very Important Business Man",2);
        flightPanam103 = new Flight()
    }
}
