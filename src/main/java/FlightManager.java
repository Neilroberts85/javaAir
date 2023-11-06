public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getPlaneBaggageAllowance(){
        return (getFlight().getPlane().getTotalWeight())/2;
    }
    public int baggageWeightPerPassenger(){
        return getPlaneBaggageAllowance() / getFlight().getPlane().getCapacity();
    }

    public int getBaggageWeightBooked(){
        return flight.getNumberOfPassengersOnFlight()*baggageWeightPerPassenger();
    }

    public int getBaggageWeightRemaining(){
        return getPlaneBaggageAllowance()-getBaggageWeightBooked();
    }

}
