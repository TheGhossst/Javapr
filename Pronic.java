package java2;

import java.util.*;

public class Pronic {
    Pronic() {
        System.out.println("Constructor ?");
    }

    void accept() {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = r.nextInt();
        r.close();
        if (ispronic(n))
            System.out.println("Pronic");
        else
            System.out.println("Not Pronic");
    }

    boolean ispronic(int n) {
        int i = 0;
        while (i <= n) {
            if (i * (i + 1) == n) {
                return true;
            } else {
                i++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Pronic p = new Pronic();
        p.accept();
    }
}
