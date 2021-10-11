package ggkhrmv.kickstart;

public class Circle {

    private double r;
    private final double pi = 3.14159;

    public Circle() {
        r = 0.0;
    }

    public Circle(double r) {
        this.r = r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    public double getRadius() {
        return r;
    }

    public double getArea() {
        return (r * r) * pi;
    }

    public double getDiameter() {
        return r * 2;
    }

    public double getCircumference() {
        return r * 2 * pi;
    }
}
