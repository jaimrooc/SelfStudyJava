package com.jaimrooc.junit;

import com.jaimrooc.junit.mockitos.Dice;

public class PlayerMockitoExample {

    private Dice dice;
    private int minNumberToWin;

    public PlayerMockitoExample(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play() {
        int diceNumber = dice.roll();
        return diceNumber > minNumberToWin;
    }

}
