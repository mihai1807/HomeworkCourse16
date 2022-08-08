package FirstSet.Problem2;

import java.util.Objects;

//Problema 2 - Numere Complexe
//1.	Scrieți o clasa numita ComplexNumber care contine:
//a.	private double re
//b.	private double im
//c.	constructor care seteaza cele două atribute
//d.	Getters pentru cele două atribute
//2.	Suprascrieti în aceasta clasa metoda equals() astfel încât sa compare două instanțe
// în funcție de valorile atributelor re și im (obiectul primit sa aiba valorile atributelor egale
// cu atributele instanței curente - this). Încercați sa tineti cont de cele 4 reguli discutate la curs.
// (Există și posibilitatea sa generati aceasta metodă, dar va recomand sa o scrieți voi prima data).
//3.	Suprascrieti metoda hashcode() astfel incat ca atunci cand două numere sunt egale conform metodei
// equals() sa aiba același hashcode. Puteti sa generati aceasta metodă.
//4.	Scrieți o clasa SuperAdvancedCalculator cu o metodă main în care sa instantiati 3 obiecte:
//ComplexNumber a = new ComplexNumber(1, 1);
//ComplexNumber b = new ComplexNumber(1, 1);
//ComplexNumber c = a;
//5.	Comparati cu == obiectele de mai sus și afișați rezultatul:
//System.out.println(a == b);
//System.out.println(a == c);
//6.	Comparati obiectele folosind metoda equals() și afișați rezultatul.
//7.	Afișați hashcode-ul fiecărui obiect
public class ComplexNumber {
private double re, im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1,1);
        ComplexNumber b = new ComplexNumber(1,1);
        ComplexNumber c = a;
        System.out.println(a==b); //false because they don't have the same hashcode
        System.out.println(a==c); //true because they make a reference to the same hashcode
        System.out.println(a.equals(b));//true because of the overwritten equals() and hashcode() methods
        System.out.println(a.equals(c));//true but redundant
        System.out.println(a.hashCode());//all three instances have the same hashcode now, a and c had it from before
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }
}
