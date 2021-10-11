package ggkhrmv.kickstart;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BarChart {

    private static int sales1;
    private static int sales2;
    private static int sales3;
    private static int sales4;
    private static int sales5;

    public static void UserIN() {

        System.out.println("Bar\tChart:\tStores");
        System.out.println("=====================");
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Please insert the sales in dollar!");
        System.out.println("Store 1: ");
        sales1 = s.nextInt();
        System.out.println("Store 2: ");
        sales2 = s.nextInt();
        System.out.println("Store 3: ");
        sales3 = s.nextInt();
        System.out.println("Store 4: ");
        sales4 = s.nextInt();
        System.out.println("Store 5: ");
        sales5 = s.nextInt();
        s.close();


    }

    public static void Out() {

        int[] Sales = {sales1, sales2, sales3, sales4, sales5};

        int[] SalesT = new int[Sales.length];

        for (int i = 0; i < Sales.length; i++) {

            SalesT[i] = Sales[i] / 100;

        }

        for (int n = 0; n < SalesT.length; n++) {

            System.out.print("Store " + (n + 1) + ": ");

            for (int g = 0; g < SalesT[n]; g++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        UserIN();
        Out();

    }

}
