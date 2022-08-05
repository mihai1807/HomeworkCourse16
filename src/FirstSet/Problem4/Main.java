package FirstSet.Problem4;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int a=0, b=100,numberToGuess,generatedNumber, guesses=0;
        System.out.println("Input a number from 0 to 99 for the computer to guess: ");
        numberToGuess = scan.nextByte();
        generatedNumber = rand.nextInt(b-a)+a;
        while (generatedNumber!=numberToGuess) {
            if (generatedNumber < numberToGuess) {
                System.out.println("The generated number is: " + generatedNumber);
                guesses++;
                a = generatedNumber;
                generatedNumber = rand.nextInt(b - a) + a;
            }
            if (generatedNumber > numberToGuess) {
                System.out.println("The generated number is: " + generatedNumber);
                guesses++;
                b = generatedNumber;
                generatedNumber = rand.nextInt(b - a) + a;
            }
        }
        System.out.println("The number "+generatedNumber+" was found after "+guesses+" tries.");
    }
}
