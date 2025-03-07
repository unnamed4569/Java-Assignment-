class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 100;
        this.breadth = 200;
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

public class Assignment4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.display();
    }
}
