package DanishDynamite;

import java.util.Scanner;

public class Opgave7_33 {

    public static void main(String[] args) {

        String[] zodiacArray = {"Monkey", "Rooster","Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        System.out.println("Enter a year: ");

        Scanner input = new Scanner(System.in);
        System.out.println("Your zodiac sign is the: " + zodiacArray[input.nextInt() % 12]);
    }
}
