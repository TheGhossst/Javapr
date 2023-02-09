import java.util.Scanner;

public class Polymorphism {
    static void area(float r) {
        System.out.println("Area of the circle is: " + (3.14 * r * r));
    }

    static void area(float l, float b) {
        System.out.println("Area of the rectangle is: " + (l * b));
    }

    static void area(int a) {
        System.out.println("Area of the square is: " + (a * a));
    }

    static void area(float b, double h) {
        System.out.println("Area of the triangle is: " + ((b * h) / 2));
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("...........................");
        System.out.println("Operations");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("4.Triangle");
        System.out.println("5.Exit");
        System.out.println("...........................");
        int ch;
        do {
            System.out.print("Enter the Choice: ");
            ch = reader.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("...........................");
                    System.out.println("Circle");
                    System.out.println("...........................");
                    System.out.print("Enter the radius of the circle: ");
                    float r = reader.nextInt();
                    area(r);
                    break;
                case 2:
                    System.out.println("...........................");
                    System.out.println("Rectangle");
                    System.out.println("...........................");
                    System.out.print("Enter the length of the rectangle: ");
                    float l = reader.nextInt();
                    System.out.println();
                    System.out.print("Enter the breadth of the rectangle: ");
                    float b = reader.nextInt();
                    area(l, b);
                    break;
                case 3:
                    System.out.println("...........................");
                    System.out.println("Square");
                    System.out.println("...........................");
                    System.out.print("Enter the edge of square: ");
                    int a = reader.nextInt();
                    area(a);
                    break;
                case 4:
                    System.out.println("...........................");
                    System.out.println("Triangle");
                    System.out.println("...........................");
                    System.out.print("Enter the base of the triangle: ");
                    float ba = reader.nextInt();
                    System.out.println();
                    System.out.print("Enter the height of the triangle: ");
                    double he = reader.nextInt();
                    area(ba, he);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (ch != 5);
        reader.close();
    }
}
/*
 * Output
 * ...........................
 * Operations
 * 1.Circle
 * 2.Rectangle
 * 3.Square
 * 4.Triangle
 * 5.Exit
 * ...........................
 * Enter the Choice: 1
 * ...........................
 * Circle
 * ...........................
 * Enter the radius of the circle: 3
 * Area of the circle is: 28.259999999999998
 * Enter the Choice: 2
 * ...........................
 * Rectangle
 * ...........................
 * Enter the length of the rectangle: 3
 * 
 * Enter the breadth of the rectangle: 1
 * Area of the rectangle is: 3.0
 * Enter the Choice: 4
 * ...........................
 * Triangle
 * ...........................
 * Enter the base of the triangle: 4
 * 
 * Enter the height of the triangle: 3
 * Area of the triangle is: 6.0
 * Enter the Choice: 5
 * Exit
 */