package Lab;

import java.util.*;

class Nandu extends Throwable {
    Nandu(int x) {
        System.out.print(x + "age");
    }
}

class ExceptionHandling {
    void validAge(int age) throws Nandu {
        if (age < 18)
            throw new Nandu(age);
        else
            System.out.println("Valid");
    }

    public static void main(String[] args) {
        ExceptionHandling ob = new ExceptionHandling();
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the age: ");
        try {
            ob.validAge(r.nextInt());
        } catch (Nandu e) {
            System.out.println(e);
        }
        r.close();
    }

}
