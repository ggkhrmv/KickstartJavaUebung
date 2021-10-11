package ggkhrmv.kickstart.ParkingTicketSim;

public class ParkedCar {

    private String CarMake;
    private String CarModel;
    private String CarColor;
    private String CarLicense;
    private int MinutesParked;

    public ParkedCar(String make, String model, String color, String License, int minParked) {

        CarMake = make;
        CarModel = model;
        CarColor = color;
        CarLicense = License;
        MinutesParked = minParked;

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

    public int getMinutesParked() {
        return MinutesParked;
    }

    public void setMinutesParked(int minutesParked) {
        MinutesParked = minutesParked;
    }
}
