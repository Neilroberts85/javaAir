import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private ArrayList<Crew> crewList;
    private ArrayList<Passenger> passengerList;
    private PlaneType plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    Random random = new Random();

    public Flight(ArrayList<Crew> crewList,
                  ArrayList<Passenger> passengerList,
                  PlaneType plane,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime) {
        this.crewList = crewList;
        this.passengerList = passengerList;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Crew> getCrewList() {
        return crewList;
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

    public void addCrew(Crew crew){
        crewList.add(crew);
    }
    public int getNumberOfCrew(){
        return crewList.size();
    }
    public boolean checkIfHasPilot(){
        for (Crew crew : crewList){
            RankType rank = crew.getRankType();
            if(rank == RankType.CAPTAIN || rank == RankType.FIRSTOFFICER){
                return true;}
            }
                return false;
        }

    public int getNumberOfPassengersOnFlight(){
        return passengerList.size();
    }
    public int getNumberOfSeatsLeft(){
        return (plane.getCapacity())-(getNumberOfPassengersOnFlight());
    }


    public void addPassengerToFlight(Passenger passenger){
        if(getNumberOfSeatsLeft() > 0) {
            passengerList.add(passenger);
        }

        passenger.setFlight(this);

        int randomNumber = random.nextInt(plane.getCapacity())+1;
        passenger.setSeatNumber(randomNumber);
    }


    }

