class Polygon {
    double dimension1;
    double dimension2;

    public Polygon(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
}

class Rectangle extends Polygon {

    public Rectangle(double length, double width) {
        super(length, width);  
    }

    public double calculateArea() {
        return dimension1 * dimension2; 
    }
}

class Triangle extends Polygon{

    public Triangle(double base, double height) {
        super(base, height); 
    }

    public double calculateArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class Assignment15 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(8, 6);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
