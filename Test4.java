package Lab;

public class Test4 {
    public static void main(String[] args) {
        try {
            doSomething();
            int a = 67 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("An Exception occurred");
        } finally {
            System.out.println("This code will always be executed");
        }
    }

    public static void doSomething() throws ArithmeticException {
        System.out.println("Error");
    }
}