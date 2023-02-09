public class Fib {
    public static void main(String args[]) {
        int a = 0, b = 1;
        int i, c = 0, n = 5;
        System.out.println("The Fibonacci series of " + n + " terms is:");
        System.out.print(a + " " + b);
        for (i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }

    }

}
