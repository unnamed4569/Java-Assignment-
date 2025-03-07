class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void readData() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age); 
        this.employeeId = employeeId;
    }

    public void readEmployeeData() {
        readData();  
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextLine();
    }

    public void displayEmployeeData() {
        displayData(); 
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        Employee emp = new Employee("", 0, "");  
        emp.readEmployeeData(); 
        emp.displayEmployeeData(); 
    }
}
