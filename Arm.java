package java2;

import java.util.Scanner;

public class Arm {
    int sum = 0;

    int check(int num, int d) {
        if (num != 0) {
            sum += Math.pow(num % 10, d);
            check(num / 10, d);
        }
        return sum;
    }

    int digits(int num) {
        int temp = num, d = 0;
        while (temp != 0) {
            temp /= 10;
            d++;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = r.nextInt();
        Arm ob = new Arm();
        int d = ob.digits(n);
        // System.out.println(d);
        int arm = ob.check(n, d);
        System.out.println("The expexted number is: " + arm);
        r.close();
    }
}