package ggkhrmv.kickstart.ParkingTicketSim;

public class ParkingTicket {

    private String CarMake;
    private String CarModel;
    private String CarColor;
    private String CarLicense;

    private int fine;

    private String PName;
    private String PSurname;
    private int PBadgeNum;

    public ParkingTicket(String carMake, String carModel, String carColor, String carLicense, int fine, String PName, String PSurname, int PBadgeNum) {
        CarMake = carMake;
        CarModel = carModel;
        CarColor = carColor;
        CarLicense = carLicense;
        this.fine = fine;
        this.PName = PName;
        this.PSurname = PSurname;
        this.PBadgeNum = PBadgeNum;
    }

    public String getCarMake() {
        return CarMake;
    }

    public void setCarMake(String carMake) {
        CarMake = carMake;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarLicense() {
        return CarLicense;
    }

    public void setCarLicense(String carLicense) {
        CarLicense = carLicense;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getPSurname() {
        return PSurname;
    }

    public void setPSurname(String PSurname) {
        this.PSurname = PSurname;
    }

    public int getPBadgeNum() {
        return PBadgeNum;
    }

    public void setPBadgeNum(int PBadgeNum) {
        this.PBadgeNum = PBadgeNum;
    }
}
