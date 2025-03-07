import java.util.Scanner;

class Circle {
    private static final double PI = 3.14159;
    private double r;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r = scanner.nextDouble();
    }

    public double calculate() {
        return PI * r * r;
    }
}

public class Assignment9 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getData();
        double area = circle.calculate();
        System.out.println("Area of the circle: " + area);
    }
}
