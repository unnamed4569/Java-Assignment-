import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.print("Enter two integer numbers: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        System.out.println("Sum of two integers: " + calc.add(int1, int2));
        
        System.out.print("Enter two double numbers: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(double1, double2));
    }
}
