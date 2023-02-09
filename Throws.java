package Lab;

import java.util.*;

public class Throws {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = r.nextInt();
        checkAge(age);
        r.close();
    }

}
