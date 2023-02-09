package Lab;

abstract class Shape {
    abstract public void numberofSides();
}

class Rectangle extends Shape {
    public void numberofSides() {
        System.out.println("The number of sides of a rectangle is: 4");
    }
}

class Triangle extends Shape {
    public void numberofSides() {
        System.out.println("The number of sides of a triangle is: 3");
    }
}

class Hexagon extends Shape {
    public void numberofSides() {
        System.out.println("The number of sides of a hexagon is: 6");
    }
}

class Tester {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();
        r.numberofSides();
        t.numberofSides();
        h.numberofSides();
    }
}