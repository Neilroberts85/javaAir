public class Pilot extends Crew {

    private String pilotLicenseNumber;

    public Pilot(String name, RankType rankType, String pilotLicenseNumber) {
        super(name, rankType);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }
    public String getPilotLicenseNumber() {

        return pilotLicenseNumber;
    }
    public String flyPlane(){
        return "My name is " + getName() + " and I will be your " + getRankType().getRank();
    }
}
