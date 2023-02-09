package Lab.java6;

import java.util.*;

public class Threadarm {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = r.nextInt();
        Prime p = new Prime(n);
        Arm a = new Arm(n);
        p.start();
        a.start();
        r.close();
    }
}

class Arm extends Thread {
    int n;

    Arm(int n) {
        this.n = n;
    }

    public void run() {
        int j = 1, c = 0;
        System.out.println("\n");
        while (c < n) {
            int t = j;
            double s = 0;
            while (t != 0) {
                s = s + Math.pow(t % 10, 3);
                t = t / 10;
            }
            if (s == j) {
                System.out.print(j + "\t");
                c++;
            }
            j++;

        }
    }
}

class Prime extends Thread {
    int n;

    Prime(int n) {
        this.n = n;
    }

    public void run() {
        int i = 0, j = 2, c = 0, f = 0;
        while (c < n) {
            for (i = 2; i < j; i++) {
                if (j % i == 0) {
                    f = 0;
                } else
                    f = 1;
            }
            if (f == 1) {
                System.out.print(j + "\t");
                c++;
            }
            j++;

        }
    }
}