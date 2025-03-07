interface Shape {
    double area();
}

interface Colorable {
    void setColor(String color);

    String getColor();
}

class ColoredRectangle implements Shape, Colorable {
    double length;
    double width;
    String color;

    public ColoredRectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.color = "No color";  
    }

    @Override
    public double area() {
        return length * width;  
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}

public class Assignment16 {
    public static void main(String[] args) {
        ColoredRectangle rectangle = new ColoredRectangle(10, 5);

        rectangle.setColor("Red");

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Color of Rectangle: " + rectangle.getColor());
    }
}
