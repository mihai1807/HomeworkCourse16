package ThirdSet.Problem5;
//Sa se initialize un StringBuilder gol.
//a.	Sa se adauge Stringul “util”.
//b.	Sa se adauge la final: “ package”
//c.	Sa se insereze, la inceput: “java.”
//d.	Sa se adauge la final “ este pachetul importat automat”.
//e.	Sa se corecteze afirmația →  sa se inlocuiasca caracterele de la poziția 5 pana la poziția 9 cu lang
//f.	Sa se adauge spatiile, punctul necesar(e)
public class StringBuilderExercise {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("util"); // a)
        s.append(" package"); // b)
        s.insert(0,"java"); // c)
        s.append(" is the automatically imported package"); // d)
        s.replace(4,8,"lang"); // e)
        s.insert(4,'.'); // f)
        s.insert(55,'.');
        System.out.println(s);
    }
}
