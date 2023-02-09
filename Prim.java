package Lab.java6;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Prim {
    public static void main(String[] args) throws FileNotFoundException {
        int n = Integer.parseInt(args[0]);
        try {
            FileWriter writer = new FileWriter("prime.txt");

            for (int i = 1; i <= n; i++) {
                if (isPrime(i)) {
                    writer.write(i + " ");
                }
            }

            writer.close();
            System.out.println("Prime numbers from 1 to " + n + " have been written");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: ");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
