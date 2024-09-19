// Michael Morris
// 19/09/2024 

import java.util.Random;
import java.util.Scanner;
// these imports are necessary for the code to work as java does not have random or scanner to work off of
public class numberguessinggame
{
    public static void main(String[] args)
    {
    Random rand = new Random(); // generating a random number
    int randomnumber = rand.nextInt(100) + 1; // making it so the random number is between 1-100, the + 1 is necessary to stop it being 0-99 
    Scanner scanner = new Scanner(System.in); // setting scanner to acquire user input for the guesses
while(true) // using a while true loop for infinite guesses
{
    System.out.println("Enter your guess: (1-100)");
    int playerguess = scanner.nextInt(); // store playerguess in method that gets the input and puts the input in the variable playerguess
    if (playerguess == randomnumber) // if user guesses the a number = to the randomly generated number then break the loop
    {
        System.out.println("Good job you got it!");
        break;
    }

    else if (playerguess > randomnumber) // if higher just print too high to help the user find the number
    {
        System.out.println("Too high");
    }

    else if (playerguess < randomnumber) // if lower just print too low to help the user find the number
    {
        System.out.println("Too low");
    }
}
    }
}