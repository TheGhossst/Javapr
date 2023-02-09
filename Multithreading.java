package java2;

import java.util.*;

public class Multithreading {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        Scanner re = new Scanner(System.in);
        System.out.print("Enter numbwe: ");
        int n = re.nextInt();
        re.close();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int x = r.nextInt(10);
            Thread2 t2 = new Thread2(x);
            Thread3 t3 = new Thread3(x);
            if (x % 2 == 0)
                t2.start();
            else
                t3.start();
            try {
                Thread1.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("exepcito");
            }
        }
    }
}

class Thread2 extends Thread {
    int x;

    Thread2(int data) {
        this.x = data;
    }

    public void run() {
        System.out.println("Square is: " + x * x);
    }
}

class Thread3 extends Thread {
    int x;

    Thread3(int data) {
        this.x = data;
    }

    public void run() {
        System.out.println("Cube is: " + x * x * x);
    }
}
