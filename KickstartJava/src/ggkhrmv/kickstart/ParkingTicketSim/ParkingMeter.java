package ggkhrmv.kickstart.ParkingTicketSim;

public class ParkingMeter {

    private int MinutesPurchased;

    public ParkingMeter(int minPurchased) {
        MinutesPurchased = minPurchased;
    }

    public int getMinutesPurchased() {
        return MinutesPurchased;
    }

    public void setMinutesPurchased(int minutesPurchased) {
        MinutesPurchased = minutesPurchased;
    }
}
