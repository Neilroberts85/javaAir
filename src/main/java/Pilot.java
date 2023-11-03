public class Pilot extends Staff{

    private String pilotLicenseNumber;

    public Pilot(String name, RankType rankType, String pilotLicenseNumber) {
        super(name, rankType);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }
}
