package ggkhrmv.kickstart;

import java.util.Scanner;

public class Uebung1 {

    static double gewicht;
    static double height;
    static double bmi;

    public static void Abfrage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dieses Programm wird Ihr BMI berechnen.");
        System.out.println("Geben Sie Ihr Gewicht in Kilogram mit einer Nachkommazahl an: ");
        gewicht = sc.nextDouble();
        System.out.println("Geben Sie Ihre Größe in Meter mit zwei Nachkommazahlen an: ");
        height = sc.nextDouble();
    }

    static double BMI(double height, double gewicht) {
        return gewicht / (height * height);
    }

    public static void Ausgabe() {
        bmi = BMI(height, gewicht);

        System.out.println("Ihr BMI ist: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Sie sind Untergewichtig, bei Beschwerden kontaktieren Sie bitte den Arzt.");
        } else if (bmi > 25) {
            System.out.println("Sie sind Übergewichtig, bei Beschwerden kontaktieren Sie bitte den Arzt.");
        } else {
            System.out.println("Sie sind Normalgewichtig");
        }
    }

    public static void main(String[] args) {

        Abfrage();
        Ausgabe();

    }
}
