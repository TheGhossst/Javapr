
//Nandu Krishna M B21CS1235
//Exp 1B Frequency of Character
import java.util.Scanner;

public class Fre {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s1 = reader.nextLine();
        System.out.print("Enter the character: ");
        char c = reader.next().charAt(0);
        reader.close();
        int l = s1.length(), f = 0;
        for (int i = 0; i < l; i++) {
            if (s1.charAt(i) == c) {
                f++;
            }
        }
        if (f == 0) {
            System.out.println("Character not Found");
        } else {
            System.out.println("Freqency of character " + c + " is " + f);
        }
    }
}
/*
 * Output
 * ........
 * Enter the String: suiiiiiiiiiii
 * Enter the character: i
 * Freqency of character i is 11
 * 
 * Enter the String: nandu
 * Enter the character: n
 * Freqency of character n is 2
 */