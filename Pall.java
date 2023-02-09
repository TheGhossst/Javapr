
//Nandu Krishna M B21CS1235
//Exp 1A Pallindrome
import java.util.Scanner;

public class Pall {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = reader.nextLine();
        reader.close();
        int i, l = s1.length();
        String s2 = "";
        for (i = l - 1; i >= 0; i--) {
            char ch = s1.charAt(i);
            s2 = s2 + ch;
        }
        if (s1.equals(s2) == true) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }

    }

}
/*
 * Output
 * .............
 * Enter a String: racecar
 * Pallindrome
 * 
 * Enter a String: java
 * Not Pallindrome
 */