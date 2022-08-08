package SecondSet.Problem3;
import java.io.Console;
//1.	Sa se creeze un program care simulează un calculator cu functionalitati minimale.
//2.	La începutul programului, se va afisa in terminal: Va rugăm sa alegeți clasic sau avansat.
//3.	Utilizatorul va trebui sa scrie ce tip de calculator dorește. Daca tipul este incorect (nu exista),
// se va afisa: “Tipul cerut nu exista. Programul se va termina”.
//4.	Cand se va alege un tip, se vor afișa operațiile disponibile
//a.	Pentru clasic: suma, diferenta, min, max
//b.	Pentru avansat: radical, modul, putere
//5.	Pentru cele care așteaptă doi parametrii, acestia vor fi cititi pe linii separate
//6.	Daca se incearca o operație inexistenta, se va afisa: “Aceasta operatie nu exista”.
//7.	Utilizatorul va fi rugat din nou sa aleaga timpul calculatorului, apoi operatia si numerele.
//8.	Programul se va termina cand se va citi “STOP”.
public class SuperAdvancedCalculator {
    public static void main(String[] args) {
        System.out.println("Type START in order to load the super-complex calculator program!");
        Console cons = System.console();
        String userInput = cons.readLine();
        int a, b;
        while (userInput.equalsIgnoreCase("start")) {
            System.out.println("Please choose: classic or advanced: ");
            userInput = cons.readLine();
            if (userInput.equalsIgnoreCase("classic")) {
                System.out.println("Operations are: sum(1), difference(2), min(3) and max(4): ");
                userInput = cons.readLine();
                switch (userInput) {
                    case ("1"):
                        System.out.println("Type a value for the first number: ");
                        a = Integer.parseInt(cons.readLine());
                        System.out.println("Type a value for the second number: ");
                        b = Integer.parseInt(cons.readLine());
                        System.out.println("The sum is: " + (a + b));
                        break;
                    case ("2"):
                        System.out.println("Type a value for the first number: ");
                        a = Integer.parseInt(cons.readLine());
                        System.out.println("Type a value for the second number: ");
                        b = Integer.parseInt(cons.readLine());
                        System.out.println("The difference is: " + (a - b));
                        break;
                    case ("3"):
                        System.out.println("Type a value for the first number: ");
                        a = Integer.parseInt(cons.readLine());
                        System.out.println("Type a value for the second number: ");
                        b = Integer.parseInt(cons.readLine());
                        System.out.println("The minimum is: " + Math.min(a, b));
                        break;
                    case ("4"):
                        System.out.println("Type a value for the first number: ");
                        a = Integer.parseInt(cons.readLine());
                        System.out.println("Type a value for the second number: ");
                        b = Integer.parseInt(cons.readLine());
                        System.out.println("The maximum is: " + Math.max(a, b));
                        break;
                    default:
                        System.out.println("This operation does not exist!Program broke!");
                        System.exit(1);
                }
            } else if (userInput.equalsIgnoreCase("advanced")) {
                System.out.println("The operations are: square root (1), absolute value(2) and number raised to a power(3): ");
                userInput = cons.readLine();
                switch (userInput) {
                    case ("1"):
                        System.out.println("Type the number: ");
                        a = Integer.parseInt(cons.readLine());
                        System.out.println("The square root of " + a + "is " + Math.sqrt(a));
                        break;
                    case ("2"):
                        System.out.println("Type the number: ");
                        a = Integer.parseInt(cons.readLine());
                        System.out.println("The absolute value of " + a + "is " + Math.abs(a));
                        break;
                    case ("3"):
                        System.out.println("Type a value for the first number, a: ");
                        a = Integer.parseInt(cons.readLine());
                        System.out.println("Type a value for the second number, b: ");
                        b = Integer.parseInt(cons.readLine());
                        System.out.println("A raised to the b power is " + Math.pow(a, b));
                        break;
                    default:
                        System.out.println("This operation does not exist!Program broke!");
                        System.exit(1);
                }
            } else if (userInput.equalsIgnoreCase("stop")) {
                System.out.println("Goodbye!");
                System.exit(1);
            } else {
                System.out.println("Invalid input. Program wil stop.");
                System.exit(1);
            }
            System.out.println("Type start again to reset the super advanced calculator");
            userInput = cons.readLine();
        }
    }
}
