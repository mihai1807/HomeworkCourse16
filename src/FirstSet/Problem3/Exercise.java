package FirstSet.Problem3;
import java.util.Random;
import java.util.Scanner;
//Problema 3 - Random [a, b)
//1.	Scrieți o metodă statică ce primește 2 numere:
// a și b și întoarce un număr random din intervalul [a, b),
// b nu face parte din interval
//Hint: random.nextInt(b - a) + a
public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Input value for a: ");
        int a = scan.nextInt();
        System.out.print("Input value for b: ");
        int b = scan.nextInt();
        int c = rand.nextInt((b-a)) + a;//selects a random int between [a,b)
        System.out.println(c);
    }
}
