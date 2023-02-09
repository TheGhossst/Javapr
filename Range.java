
public class Range {
    public static void main(String args[]) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int i = 0, re = 0;
        int n3, n4;
        for (i = n1; i <= n2; i++) {
            n3 = i;
            n4 = 0;
            while (n3 != 0) {
                re = n3 % 10;
                n3 /= 10;
                n4 = n4 * 10 + re;
            }
            if (i == n4) {
                System.out.print(n4 + " ");
            }

        }

    }
}
