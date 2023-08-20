import java.util.Scanner;

class Book {

    private String bookId, title, author;
    private int price;

    public Book() {
    }

    public Book(String id, String tlt, String atr, int prc) {

        bookId = id;
        title = tlt;
        author = atr;
        price = prc;
    }

    public void getDetails() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the bookId : ");

        bookId = input.next();

        System.out.print("Enter the title : ");

        title = input.next();

        System.out.print("Enter the author : ");

        author = input.next();

        System.out.print("Enter the price : ");

        price = input.nextInt();
    }

    public void printDetails() {

        System.out.println("Book Id : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

public class BookDemo {

    public static void main(String[] args) {

        Book obj1 = new Book(), obj2 = new Book();

        obj1.getDetails();
        System.out.println();
        obj1.printDetails();
        System.out.println();
        obj2.getDetails();
        System.out.println();
        obj2.printDetails();
    }
}
