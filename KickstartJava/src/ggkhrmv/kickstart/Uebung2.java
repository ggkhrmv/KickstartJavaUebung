package ggkhrmv.kickstart;

public class  Uebung2 {

    static double celsius(double fahrenheit) {
        return ((5.0 / 9.0) * (fahrenheit - 32));
    }

    public static void AusgabeTabelle() {
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("====================");

        for (int x = 0; x <= 100; x++) {
            System.out.print(x);
            System.out.print("\t\t");
            System.out.print(celsius(x));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AusgabeTabelle();
    }

}
