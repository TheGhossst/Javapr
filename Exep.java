public class Exep {
    public static void main(String args[]) {
        try {
            int n = 100 / 0;
            System.out.println(n);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest");
    }
}