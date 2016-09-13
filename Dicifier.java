/****************************************************************************
 *
 * Created by: Jess 
 * Created on: Sept 2016
 * This program randomly generates a number and allows you to guess it. It
 *     then tells you how many guesses it took.
 *
 ****************************************************************************/

import java.io.*;

public class Dicifier {

 public static void main(String[] args) throws IOException
 {
   int userNumber;
   int diceNumber = (int )(Math.random() * 6 + 1);
   int numberOfGuesses = 1;

   boolean correct = false;

   while (!(diceNumber == userNumber))
    {

    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);

    userNumber = Integer.parseInt(br.readLine());

    if (userNumber == diceNumber) {

    correct = true;

    System.out.println("You guessed the number " + diceNumber + " in " + numberOfGuesses + " tries!");
    } else {

   numberOfGuesses++;
   System.out.println("Guess again!");
   }

   }


    //System.out.println(diceNumber);
 }

}
