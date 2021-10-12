package ggkhrmv.kickstart.FishingGameSim;

import java.util.*;

public class FishingGame {

    public static void main(String[] args) {

        boolean EndGame = false;
        int userIn;
        int HScore = 0;
        List<String> ItemsF = new ArrayList<>();

        Map<Integer, RollOutcome> outComeMap = new HashMap<>();
        outComeMap.put(1, new RollOutcome("huge fish", 10));
        outComeMap.put(2, new RollOutcome("an old shoe", 20));
        outComeMap.put(3, new RollOutcome("little fish", 30));
        outComeMap.put(4, new RollOutcome("30 inch walleye", 40));
        outComeMap.put(5, new RollOutcome("Salt water redfish", 50));
        outComeMap.put(6, new RollOutcome("52 inch muskellunge", 60));

        Scanner s = new Scanner(System.in);

        System.out.println("FISHING\tGAME");
        System.out.println();
        System.out.println("For this game you will roll a dice\nAccording to the number you rolled, you will fish an item");
        System.out.println("Each item has a different value, you will see your score at the end of the game.");
        System.out.println();
        System.out.println("Do you wish to start? (y/n)");
        String YorN = s.nextLine();

        if (YorN.equals("y")) {

            do {

                System.out.println();
                System.out.println("Do you wish to throw a dice?\n1: Yes\n2: No");
                userIn = s.nextInt();
                if (userIn == 1) {

                    Dice dice = new Dice();
                    RollOutcome outcome = outComeMap.get(dice.getValue());
                    System.out.println("You threw a " + dice.getValue());
                    System.out.println("You caught: " + outcome.getMessage());
                    System.out.println("Points: " + outcome.getPoints());

                    HScore += outcome.getPoints();

                    ItemsF.add(outcome.getMessage());

                } else {
                    EndGame = true;
                }

            } while (!EndGame);

            System.out.println("Thank you for playing!\nYour High Score is: " + HScore);
            System.out.println("Items you fished: ");
            for (int i = 0; i < ItemsF.size(); i++) {
                System.out.println(i + ". " + ItemsF.get(i));
            }

            System.out.println();

            if (HScore < 100) {
                System.out.println("Better Luck next time");
            } else {
                System.out.println("BOOM, lets get the grill started");
            }

        } else {
            System.out.println("Thank you, the game will terminate shortly.");
        }


    }

}
