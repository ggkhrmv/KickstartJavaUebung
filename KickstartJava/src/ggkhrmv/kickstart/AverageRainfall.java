package ggkhrmv.kickstart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageRainfall {

    public static int y;
    static List<Double> rainFall = new ArrayList<>();
    public static double monthFall;


    public static void UserIN() {

        System.out.println("Average Rainfall Calculator");
        Scanner s = new Scanner(System.in);
        System.out.println("Number of years: ");
        y = s.nextInt();
        System.out.println("Enter the rainfall in cm for each month!");

        for (int i = 0; i < y; i++) {

            for (int n = 1; n < 13; n++) {

                System.out.println("Year " + (i + 1) + " Month " + n);
                monthFall = s.nextDouble();

                rainFall.add(monthFall);

            }
        }
    }

    public static void Output() {

        System.out.println("Number of months: "+(y*12));
        System.out.println("Total rainfall: " + sum(rainFall) + " cm");
        System.out.println("Average rainfall per month: " + avg(rainFall) + " cm");

    }

    private static double avg(List<Double> rainFall) {
        return sum(rainFall)/(y*12);
    }

    private static double sum(List<Double> rainFall) {
        double sum = 0;
        for (Double aDouble : rainFall) {
            sum = sum + aDouble;
        }
        return sum;
    }

    public static void main(String[] args) {

        UserIN();
        Output();

    }

}
