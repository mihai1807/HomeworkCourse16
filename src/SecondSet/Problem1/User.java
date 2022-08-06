package SecondSet.Problem1;

import java.util.Scanner;

public class User {
    Scanner scan = new Scanner(System.in);

    public void startWriting(){
        String userInput = scan.nextLine();
        if (!userInput.equalsIgnoreCase("start")) {
            System.out.println("Type START in order to start checking.");
            startWriting();
        }
        System.out.println("Now you can start typing and the program will calculate your total time and average time per letter.");
    }

    public void calculateTime(){
        long startTime = System.currentTimeMillis();
        String textToCheck = scan.nextLine();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println("Your total time was "+totalTime+" milliseconds. You wrote "+textToCheck.length()+
                " characters and your average time per character was "+totalTime/textToCheck.length()+" milliseconds.");
    }

    public void typingSpeed() {
        System.out.println("This small program will  measure your typing speed. Type START.");
        startWriting();
        calculateTime();
        System.out.println("Would you like to try again?");
        String tryAgain = scan.nextLine();
        if (tryAgain.equalsIgnoreCase("yes")) {
            System.out.println("Start typing!");
            calculateTime();
            System.exit(1);
        } else System.exit(1);
    }
}
