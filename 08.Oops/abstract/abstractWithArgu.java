
public class abstractWithArgu {
   // Abstract class
abstract class Shape {
    // Abstract method with arguments
    abstract void calculateArea(double dimension1, double dimension2);

    // Concrete method
    void showInfo() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass: Rectangle
class Rectangle extends Shape {
    @Override
    void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

// Concrete subclass: Circle
class Circle extends Shape {
    @Override
    void calculateArea(double radius, double unused) {  // Second parameter is unused
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

// Main class
public class AbstractionWithArguments {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.calculateArea(10, 5);  // Passing arguments to abstract method

        Shape circle = new Circle();
        circle.calculateArea(7, 0); // Second argument is ignored
    }
}
 
}
