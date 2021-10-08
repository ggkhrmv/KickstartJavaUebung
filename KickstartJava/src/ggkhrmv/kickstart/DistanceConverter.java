package ggkhrmv.kickstart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistanceConverter {


    static Scanner s = new Scanner(System.in);
    static double distance;

    static double MtoKM(double d) {
        return d * 0.001;
    }

    static double MtoIN(double d) {
        return d * 39.37;
    }

    static double MtoFT(double d) {
        return d * 3.281;
    }


    public static void UserIn() {

        boolean InCorrect = false;

        System.out.println("Distance\tconverter");
        System.out.println("====================");

        while (!InCorrect) {

            System.out.println("Please enter a distance in meters you want to convert: ");
            distance = s.nextDouble();

            if (distance > 0) {
                InCorrect = true;
            } else {
                System.out.println("Please enter a valid distance!");
            }

        }
        System.out.println();

    }

    public static void UI() {

        int select;

        List<String> UI = new ArrayList<>();
        UI.add("Convert to kilometers");
        UI.add("Convert to inches");
        UI.add("Convert to feet");
        UI.add("Quit the program");

        do {

            //Show the menu
            for (int i = 0; i < UI.size(); i++) {
                System.out.println(i + 1 + ". " + UI.get(i));
            }

            System.out.println("Choose an option from the menu: ");
            select = s.nextInt();

            while (select < 1 || select > 4) {
                System.out.println("Please enter a valid number!");
                select = s.nextInt();
            }

            switch (select) {
                case 1 -> System.out.println(distance + " meters in kilometers are: " + MtoKM(distance) + " km");
                case 2 -> System.out.println(distance + " meters in inches are: " + MtoIN(distance) + " inches");
                case 3 -> System.out.println(distance + " meters in feet are: " + MtoFT(distance) + " ft");
                case 4 -> System.out.println("Okay, bye!");
            }

            System.out.println();
        } while (select != 4);


    }

    public static void main(String[] args) {
        UserIn();
        UI();
    }
}


