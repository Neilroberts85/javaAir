import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilotList;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengerList;
    private PlaneType plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilotList,
                  ArrayList<CabinCrewMember> cabinCrew,
                  ArrayList<Passenger> passengerList,
                  PlaneType plane,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime) {
        this.pilotList = pilotList;
        this.cabinCrew = cabinCrew;
        this.passengerList = passengerList;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilotList() {
        return pilotList;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public PlaneType getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPilot(Pilot pilot){
        pilotList.add(pilot);
    }
    public void addCrew(CabinCrewMember cabinCrewMember){
        cabinCrew.add(cabinCrewMember);
    }
    public void addPassenger(Passenger passenger){
        passengerList.add(passenger);
    }
    public int getNumberOfPilots(){
        return pilotList.size();
    }
}
