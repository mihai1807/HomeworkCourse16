package SecondSet.Problem2;
import java.io.Console;
//Sa se creeze programul “Ghicește cate litere ai scris!”
//1.	Sa se afiseze “Poți începe sa scrii”
//2.	In acest moment, utilizatorul poate scrie oricate linii. Ca sa se sa oprească,
// ultima linie scrisă de utilizator trebuie sa fie comanda “STOP”.
//3.	După introducerea acestei comenzi, utilizatorul este rugat sa introduca numărul de
// caractere pe care crede ca l-a scris.
//4.	Se va citi acest numar. Apoi i se va spune utilizatorului cât de aproape a fost de
// adevăr. Daca a scris mai multe caractere, se va afisa: “De fapt, ai scris mai mult cu X caractere.
// Ai scris in total Y caractere”. Y reprezinta numarul de caractere total, iar X diferenta dintre inputul
// (presupunera facuta de utilizator) si numarul real, Y.
//Daca a scris mai putine, se va afisa: “De fapt, ai scris mai putin cu X caractere. Ai scris
// in total Y caractere”.
//5.	Daca utilizatorul ghicește, se va afisa: “Felicitari, ai ghicit!”
//6.	Nu se vor lua in calcul și literele pentru STOP.
//
//Observatii
//●	Daca nu este specificat ce se va intampla in cazuri exceptionale, nu se vor trata aceste cazuri.
// De exemplu, nu luăm in calcul cazul în care utilizatorul introduce un număr invalid.
//●	Se recomanda utilizarea clasei Console, astfel incat este obligatoriu ca rularea sa fie făcută din terminal
public class GuessHowManyLetters {
    public static void main(String[] args) {
        Console cons = System.console();
        System.out.println("You can start typing");
        String userInput = cons.readLine();
        int numberOfLetters = 0;
        while (!userInput.equalsIgnoreCase("stop")) {
            numberOfLetters += userInput.length();
            userInput = cons.readLine();
        }
        System.out.println("Guess how many letters you typed?");
        int userGuess = Integer.parseInt(String.valueOf(cons.readLine()));
        if (userGuess == (numberOfLetters - 4)) {
            System.out.println("Congratulations! You guessed correct!");
        } else {
            int difference = numberOfLetters - userGuess;
            if (difference > 0) {
                System.out.println("You actually wrote more by " + difference + " characters. You wrote in total " +
                        numberOfLetters + " characters.");
            } else {
                difference = -difference;
                System.out.println("You actually wrote less by " + difference + " characters. You wrote in total " +
                        numberOfLetters + " characters.");
            }
        }
    }
}
