package ThirdSet.Problem2;
import java.util.Scanner;

//Sa se citeasca de la tastatura un text și sa se afișeze doar cu prima litera majuscula.
//Exemplu: Se citește “cURS de JaVa”, se afiseaza “Curs de java”

public class ArrangeText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a text please: ");
        String userInput = scan.nextLine();
        String s1 = userInput.toLowerCase();
        s1 = s1.substring(0,1).toUpperCase() + s1.substring(1);
        System.out.println(s1);
    }
}
