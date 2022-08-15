package br.com.gurps.character.validator;

import java.util.Random;

public class RollADie {

    private static void rollDices(int dicesNumber) {

        // Initializing the Random object for
        // generating random numbers
        Random randomizer = new Random();

        System.out.print("Hey Geek! You rolled: ");
        int total = 0;
        int randomNumber = 0;

        for (int i = 0; i < dicesNumber; i++) {
            // Generating the random number and storing it
            // in the 'randomNumber' variable
            total = getTotal(randomizer, total);
        }
        System.out.println("");
        System.out.println("Total: " + total);

    }

    private static int getTotal(Random ranNum, int total) {
        int randomNumber;
        randomNumber = ranNum.nextInt(6) + 1;
        total = total + randomNumber;
        System.out.print(randomNumber);
        System.out.print(" ");
        return total;
    }

}
