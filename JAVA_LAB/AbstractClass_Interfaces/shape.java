package AbstractClass_Interfaces;
abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class shape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea()); // Output: 15.0

        Circle circle = new Circle(2.5);
        System.out.println("Area of Circle: " + circle.calculateArea()); // Output: 19.634954084936208
    }
}
