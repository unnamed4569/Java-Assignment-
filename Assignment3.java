import java.util.Scanner;

class Book {
    private String book_name;
    private String ISBN;
    private String author;
    private double price;

    public void Assignment3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book name: ");
        book_name = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        ISBN = scanner.nextLine();
        System.out.print("Enter author name: ");
        author = scanner.nextLine();
        System.out.print("Enter price: ");
        price = scanner.nextDouble();
    }

    public void DisplayData() {
        System.out.println("Book Name: " + book_name);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Book b = new Book();
        b.Assignment3();
        System.out.println("\nBook Details:");
        b.DisplayData();
    }
}
