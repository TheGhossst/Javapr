package java2;

import java.util.*;

class Convert {

    void accept() {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int n = r.nextInt();
        System.out.print("Enter the year: ");
        int y = r.nextInt();
        r.close();
        Convert c = new Convert();
        c.day_to_date(n, y);
    }

    void day_to_date(int n, int y) {
        int i = 0, d = 0;
        int a[] = { 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
        while (n > a[i]) {
            n = n - a[i];
            i++;
        }
        d = n;
        int m = i + 1;
        display(m, d, y);
    }

    void display(int m, int d, int y) {
        String month[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        System.out.println(month[m] + " " + d + " " + y);
    }

    public static void main(String[] args) {
        Convert c = new Convert();
        c.accept();

    }
}