package ggkhrmv.kickstart.ParkingTicketSim;

public class ParkingTicketSim {

    public static void showTicket(ParkingTicket ticket) {
        System.out.println("PARK\tTICKET");
        System.out.println("=============================");
        System.out.println("Car Make: " + ticket.getCarMake());
        System.out.println("Car Model: " + ticket.getCarModel());
        System.out.println("Car Color: " + ticket.getCarColor());
        System.out.println("Car License: " + ticket.getCarLicense());
        System.out.println("Fine: " + ticket.getFine());
        System.out.println("Police Officer Name: " + ticket.getPName() + " " + ticket.getPSurname());
        System.out.println("Police Officer Badge: " + ticket.getPBadgeNum());

    }

    public static void main(String[] args) {
        ParkedCar car1 = new ParkedCar("Toyota", "Supra", "Black", "SÖM-GK999", 121);
        ParkingMeter meter1 = new ParkingMeter(60);
        PoliceOfficer POfficer1 = new PoliceOfficer("Mark", "Mole", 1234567);

        if (POfficer1.TimeExpired(car1, meter1)) {
            System.out.println("A Park Ticket has been Issued");
            System.out.println("=============================");
            showTicket(POfficer1.IssueTicket(car1, meter1));
        } else {
            System.out.println("No rule violation has been found.");
        }

    }
}
