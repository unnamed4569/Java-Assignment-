import java.util.Scanner;

class Box {
    private double length, breadth, height;

    public void Assignment2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length, breadth, and height of the box: ");
        length = scanner.nextDouble();
        breadth = scanner.nextDouble();
        height = scanner.nextDouble();
    }

    public double Volume() {
        return length * breadth * height;
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Box b = new Box();
        b.Assignment2();
        System.out.println("Volume of the box: " + b.Volume());
    }
}