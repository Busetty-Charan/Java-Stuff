import java.util.Scanner;

class Product {

    private String pid;
    private String prodName;
    private double price;

    public Product() {

    }

    public void getDetails() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product ID : ");

        pid = input.next();

        System.out.print("Enter Name : ");

        prodName = input.next();

        System.out.print("Enter price : ");

        price = input.nextDouble();
    }

    public void displayDetails() {

        System.out.println("Product ID : " + pid);
        System.out.println("Name : " + prodName);
        System.out.println("Price : " + price);
    }

    public int compare(Product comprod) {

        return (price > comprod.price) ? 1 : (price == comprod.price) ? 0 : -1;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        
        Product prod1 = new Product();
        Product prod2 = new Product();
        Product prod3 = new Product();

        System.out.println("Enter details for Product 1 : \n");
        prod1.getDetails();
        System.out.println("Enter details for Product 2 : \n");
        prod2.getDetails();
        System.out.println("Enter details for Product 3 : \n");
        prod3.getDetails();

        System.out.println("Result of comparing Product 1 with Product 2 : " + prod1.compare(prod2));
        System.out.println("Result of comparing Product 2 with Product 1 : " + prod2.compare(prod1));
        System.out.println("Result of comparing Product 1 with Product 3 : " + prod1.compare(prod3));
    }
}
