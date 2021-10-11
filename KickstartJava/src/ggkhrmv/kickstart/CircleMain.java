package ggkhrmv.kickstart;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        double r;
        System.out.println("CIRCLE");
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the radius of a circle: ");
        r = s.nextDouble();
        Circle circle = new Circle(r);
        s.close();
        System.out.println("Area is "+circle.getArea());
        System.out.println("Diameter is "+circle.getDiameter());
        System.out.println("Circumference is "+circle.getCircumference());
    }
}
