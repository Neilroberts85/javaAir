public class Pilot extends Staff{

    private String pilotLicenseNumber;

    public Pilot(String name, String rank, String pilotLicenseNumber) {
        super(name, rank);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }
}
