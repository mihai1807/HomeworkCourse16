package ThirdSet.Problem3;
//Se da un array de Stringuri în care există o pereche (2 String-uri au aceeași valoare), gasiti String-ul duplicat.
//Exemplu: {“text”, “pisica”, “nume”, “text”} -> “text” este duplicat

public class MatchingStrings {
    public static void main(String[] args) {
        String[] arr = {"text", "cat", "name", "text"};
        boolean duplicate = false;
        String duplicateString = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    duplicate=true;
                    duplicateString = arr[i];
                    break;
                }
            }
        }
        if (duplicate) System.out.println(duplicateString+" is a duplicate.");
        else System.out.println("No duplicates found.");
    }
}
