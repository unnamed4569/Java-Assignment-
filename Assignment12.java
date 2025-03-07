class Polygon {
    double dimension1;
    double dimension2;

    public void ReadDimension(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
}

class Rectangle extends Polygon {

    public double calculateArea() {
        return dimension1 * dimension2;  
    }
}

class Triangle extends Polygon {

    public double calculateArea() {
        return 0.5 * dimension1 * dimension2; 
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.ReadDimension(10, 5);  
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle();
        triangle.ReadDimension(8, 6); 
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
