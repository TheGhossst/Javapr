package Lab;

import java.util.*;

public class Employee1 {
    int age;
    long phno;
    String name;
    String address;
    float sal;

    public void printSalary() {
        System.out.println("Salary is: " + this.sal);
    }
}

class Officer extends Employee1 {
    String specialization;
}

class Manager extends Employee1 {
    String department;
}

class Assign {
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        Officer o = new Officer();
        Manager m = new Manager();
        int c;
        do {
            System.out.println("..................");
            System.out.println("1.Officer");
            System.out.println("2.Manager");
            System.out.println("3.Exit");
            System.out.println("..................");
            System.out.print("Enter the choice: ");
            c = r.nextInt();
            switch (c) {
                case 1:
                    System.out.println("..................");
                    System.out.println("Officer");
                    System.out.println("..................");
                    o.age = 5;
                    o.name = "Nandj";
                    o.phno = 944730;
                    o.address = "ddddddd";
                    System.out.println("Name: " + o.name);
                    System.out.println("Age: " + o.age);
                    System.out.println("Address: " + o.address);
                    o.sal = 30;
                    o.printSalary();
                    break;
                case 2:
                    System.out.println("..................");
                    System.out.println("Manager");
                    System.out.println("..................");
                    m.age = 25;
                    m.name = "ffandj";
                    m.phno = 244730;
                    m.address = "dddfffddd";
                    System.out.println("Name: " + m.name);
                    System.out.println("Age: " + m.age);
                    System.out.println("Address: " + m.address);
                    m.sal = 123;
                    m.printSalary();
                    break;
            }
        } while (c != 3);
        r.close();

    }

}