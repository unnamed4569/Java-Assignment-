import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Sum of two numbers: " + calc.add(num1, num2));
        
        System.out.print("Enter three numbers: ");
        int num3 = scanner.nextInt();
        System.out.println("Sum of three numbers: " + calc.add(num1, num2, num3));
    }
}