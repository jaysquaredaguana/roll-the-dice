package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1, roll2, sum;
        int twoCounter = 0, fourCounter = 0,
                sixCounter = 0, sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            // Print the value of each roll of the dice formatted like this:
            // Roll 1: 4 - 6 Sum: 10
            System.out.printf("Roll %d: %d - %d Sum: %d%n", i, roll1, roll2, sum);

            switch (sum) {
                case 2 -> twoCounter++;
                case 4 -> fourCounter++;
                case 6 -> sixCounter++;
                case 7 -> sevenCounter++;
            }
        }
        System.out.println("twoCounter: " + twoCounter);
        System.out.println("fourCounter: " + fourCounter);
        System.out.println("sixCounter: " + sixCounter);
        System.out.println("sevenCounter: " + sevenCounter);
    }

    public static int roll() {
        int maxValue = 6;
        int minValue = 1;
        return (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}
