import java.util.Scanner;

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = scanner.nextInt();

        Rectangle rect = new Rectangle(length, breadth);
        rect.display();
    }
}
