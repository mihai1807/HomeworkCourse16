package ThirdSet.Problem4;
import java.util.Objects;
import java.util.Scanner;

//Se da un String, sa se verifice dacă este palindrom sau nu.
//“madam” → este palindrom
//“text” → nu este palindrom
//“8118” → este palindrom
//“81218” → este palindrom
//“812318” → nu este palindrom
//Rezolvati aceasta problema cu array, cu StringBuilder, cu String (charAt()).
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome or not: ");
        String stringToCheck = scan.nextLine();

        //Solving with StringBuilder
        System.out.println("Solution with StringBuilder");
        StringBuilder sb = new StringBuilder(stringToCheck);
        if (Objects.equals(String.valueOf(sb), String.valueOf(sb.reverse()))) {
            System.out.println(stringToCheck+" is a palindrome.");
        } else System.out.println(stringToCheck+" is not a palindrome.");
        System.out.println();

        //Solving with array
        System.out.println("Solution with array");
        char[] characters = stringToCheck.toCharArray();
        boolean isPalindrome = true;
        for (int i=0; i <= characters.length-1;i++){
            if (characters[i] != characters[characters.length - 1 - i]) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) System.out.println(stringToCheck+" is a palindrome.");
        else System.out.println(stringToCheck+" is not a palindrome");
        System.out.println();

        //Solving with String.charAt()
        System.out.println("Solution with String.charAt()");
        boolean itSureIs = true;
        for (int i=0; i<stringToCheck.length()/2; i++) {
            if (stringToCheck.charAt(i) !=stringToCheck.charAt(stringToCheck.length()-1-i)) {
                itSureIs = false;
            }
        }
        if (itSureIs) System.out.println(stringToCheck+" is a palindrome.");
        else System.out.println(stringToCheck+" is not a palindrome.");
    }
}
