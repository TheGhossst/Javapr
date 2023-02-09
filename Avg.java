package java2;

class InvalidNumberException extends Throwable {
    InvalidNumberException() {
        System.out.println("Invalid Number");
    }
}

public class Avg {
    public static void check(String[] args) throws InvalidNumberException {
        int n, s = 0, i = 0;
        while (args[i] != "\0") {
            n = Integer.parseInt(args[i]);
            s = s + n;
            i++;
        }
        System.out.println(("Average is: " + (s / i)));
    }

}
