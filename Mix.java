package java2;

import java.util.*;

public class Mix {
    String wrd = "", wrd1 = "", wrd2 = "";
    int len = 0;

    Mix() {
    }

    void feedword() {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the word1: ");
        wrd1 = r.nextLine();
        wrd1 = wrd1.toUpperCase();
        System.out.println(wrd1);
        System.out.print("Enter the word2: ");
        wrd2 = r.nextLine();
        wrd2 = wrd2.toUpperCase();
        System.out.println(wrd2);
        r.close();
        wrd = mix_word(wrd1, wrd2);
        // System.out.println(wrd);
        display();
    }

    String mix_word(String wrd1, String wrd2) throws StringIndexOutOfBoundsException {
        String wrd3 = "";

        int l1 = wrd1.length(), l2 = wrd2.length(), i = 0;
        while (i < l1 && i < l2) {
            wrd3 = wrd3 + wrd1.charAt(i) + wrd2.charAt(i);
            i++;
        }
        if (l1 > l2) {
            for (i = l2; i < l1; i++) {
                wrd3 = wrd3 + wrd1.charAt(i);
            }
        } else if (l1 < l2) {
            for (i = l1; i < l2; i++) {
                wrd3 = wrd3 + wrd2.charAt(i);
            }
        }
        return wrd3;

    }

    void display() {
        System.out.println("The expected word is: " + wrd);
    }

    public static void main(String[] args) {
        Mix m = new Mix();
        m.feedword();
    }
}
