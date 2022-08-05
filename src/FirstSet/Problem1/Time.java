package FirstSet.Problem1;
//Problema 1 - Time
//1.	Scrieți o clasă Time care are 3 campuri: hours, minutes, seconds.
//2.	Suprascrieti metoda toString() care sa intoarca o reprezentare a acestei clase. Se întoarce un
// String cu orele, minutele și secundele separate prin “:” (două puncte). Dacă un număr (care reprezinta
// ora, minutele sau secundele) contine o singura cifra, atunci adaugati un 0 înainte.
//Exemplu:
//int hours = 21; int minutes = 34; int seconds = 49 ->
//“21:34:49”
//
//int hours = 1; int minutes = 5; int seconds = 14 ->
//“01:05:14”
public class Time {
    int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        String printedHours, printedMinutes, printedSeconds;
        if (hours<10) printedHours = "0" + hours;
        else printedHours = String.valueOf(hours);
        if (minutes<10) printedMinutes = "0" + minutes;
        else printedMinutes = String.valueOf(minutes);
        if (seconds<10) printedSeconds = "0" + seconds;
        else printedSeconds = String.valueOf(seconds);
        return printedHours+":"+printedMinutes+":"+printedSeconds;
    }
    public static void main(String[] args) {
        Time time = new Time(1,5,7);
        Time time2 = new Time(12,10,54);
        System.out.println(time);
        System.out.println(time2);

    }
}
