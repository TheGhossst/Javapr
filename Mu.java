
//Nandu Krishna M B21CS1235 
//MultiThreading
import java.util.*;

public class Mu {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        try {
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                int x = r.nextInt(1, 10);
                System.out.println("Number is: " + x);
                Thread2 t2 = new Thread2(x);
                Thread3 t3 = new Thread3(x);
                if (x % 2 == 0)
                    t2.start();
                else
                    t3.start();
                Thread1.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    int x;

    Thread2(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Sqaure of " + x + " is " + x * x);
    }
}

class Thread3 extends Thread {
    int x;

    Thread3(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Cube of " + x + " is " + x * x * x);
    }
}
/*
 * Output
 * Number is: 2
 * Sqaure of 2 is 4
 * Number is: 1
 * Cube of 1 is 1
 * Number is: 6
 * Sqaure of 6 is 36
 * Number is: 8
 * Sqaure of 8 is 64
 * Number is: 3
 * Cube of 3 is 27
 * Number is: 4
 * Sqaure of 4 is 16
 * Number is: 1
 * Cube of 1 is 1
 * Number is: 2
 * Sqaure of 2 is 4
 * Number is: 1
 * Cube of 1 is 1
 * Number is: 4
 * Sqaure of 4 is 16
 */