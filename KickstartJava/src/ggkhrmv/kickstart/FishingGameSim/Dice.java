package ggkhrmv.kickstart.FishingGameSim;

import java.util.Random;

public class Dice {

    private final int sides = 6;
    private int value;

    public Dice() {
        roll();
    }

    public void roll() {
        Random r = new Random();
        value = r.nextInt(sides) + 1;
    }

    public int getValue() {
        return value;
    }

}
