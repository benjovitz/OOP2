package com.company;

public class TestDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice.getFaceValue());
        dice.roll();
        System.out.println(dice.getFaceValue());
    }
}
