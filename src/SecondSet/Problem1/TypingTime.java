package SecondSet.Problem1;
//Sa se creeze un program care verifica cat de repede scrie utilizatorul
//1.	Sa se citeasca de la tastatura pana cand se citeste “START”. Daca userul introduce orice altceva,
// sa se afiseze: “Scrie START pentru a începe!”.
//2.	După ce se userul scrie START, sa se afiseze: “Acum poți începe sa scrii iar programul îți va calcula
// timpul total, dar si media pe litera”
//3.	După ce utilizatorul scrie si da enter (termina linia) sa se afiseze: “Timpul total a fost x milisecunde.
// Ai scris y caractere, iar media de timp pe caracter a fost z”. X este numarul total de milisecunde, Y - este
// numărul de caractere scris de user, iar Z timpul mediu pentru un caracter.
//4.	Sa se afiseze “Vrei sa mai incerci o data?”. Daca userul scrie “DA”, atunci el va fi invitat sa scrie.
// Dupa ce va termina linia, se vor face aceleasi calcule, iar programul se va termina.
//5.	Daca userul scrie “NU”, sau orice altceva in afara de ”DA”, atunci se va termina programul.
public class TypingTime {
    public static void main(String[] args) {
        User user = new User();
        user.typingSpeed();
    }
}
