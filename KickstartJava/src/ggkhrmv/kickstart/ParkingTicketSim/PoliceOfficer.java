package ggkhrmv.kickstart.ParkingTicketSim;

public class PoliceOfficer {

    private String PName;
    private String PSurname;
    private int PBadgeNum;

    public PoliceOfficer(String Name, String Surname, int Badge) {

        PName = Name;
        PSurname = Surname;
        PBadgeNum = Badge;

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

    public boolean TimeExpired(ParkedCar car, ParkingMeter meter) {

        return car.getMinutesParked() > meter.getMinutesPurchased();
    }

    public ParkingTicket IssueTicket(ParkedCar car, ParkingMeter meter) {


        int fine = 25;
        int illegalTime;

        illegalTime = car.getMinutesParked() - meter.getMinutesPurchased() - 60;

        while (illegalTime > 0) {
            illegalTime = illegalTime - 60;
            fine = fine + 10;
        }

        return new ParkingTicket(car.getCarMake(), car.getCarModel(), car.getCarColor(), car.getCarLicense(), fine, PName, PSurname, PBadgeNum);

    }

}
