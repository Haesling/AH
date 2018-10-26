package DanishDynamite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Exercise 5_44. Computer architecture: bit-level operations

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int number = input.nextInt();

        for (int i = 15; i >= 0; i--) {
            System.out.println(number >> i & 1);
        }




        }
    }


