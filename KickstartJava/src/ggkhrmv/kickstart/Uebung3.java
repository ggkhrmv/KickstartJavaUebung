package ggkhrmv.kickstart;

import java.util.Scanner;

public class Uebung3 {

    static int AB; //Anzahl Bücher
    static int points;

    public static void Eingabe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dieses Programm wird Ihre monatliche Anzahl an Buchklub Punkten berechnen.");
        System.out.println();
        System.out.println("Wie viele Bücher haben Sie diesen Monat gelesen?: ");
        AB = sc.nextInt();
    }

    public static int PunkteBerechnen(int AB) {
        if (AB < 1) {
            return 0;
        } else if (AB == 1) {
            return 5;
        } else if (AB == 2) {
            return 15;
        } else if (AB == 3) {
            return 30;
        } else {
            return 60;
        }
    }

    public static void main(String[] args) {
        Eingabe();
        points = PunkteBerechnen(AB);
        System.out.println("Diesen Monat haben Sie " + points + " Punkte gesammelt.");
    }
}
