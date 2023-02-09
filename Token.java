package java2;

import java.util.*;

class Token {
    public static void main(String args[]) {
        int sum = 0;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter integers: ");
        String s = r.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        String c;
        while (st.hasMoreTokens()) {
            c = st.nextToken();
            System.out.println(c);
            sum = sum + Integer.parseInt(c);
        }
        System.out.println("sum of the integers is: " + sum);
        r.close();
    }
}
