import java.util.Scanner;

class Customer {

    protected String custID;
    protected String custName;
    protected String contactNo;
    protected String orderValue;
}

class VIPCustomer extends Customer {

    private String bonus;

    public void getDetails() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Customer ID : ");
        custID = input.next();

        System.out.print("Enter Customer Name : ");
        custName = input.next();

        System.out.print("Enter Contact Number : ");
        contactNo = input.next();

        System.out.print("Enter Order Value : ");
        orderValue = input.next();

        System.out.print("Enter Bonus : ");
        bonus = input.next();
    }

    public void displayDetails() {

        System.out.println("Customer ID : " + custID);
        System.out.println("Name : " + custName);
        System.out.println("Contact Number : " + contactNo);
        System.out.println("Order Value : " + orderValue);
        System.out.println("Bonus : " + bonus);
    }
}

public class CustomerDemo {

    public static void main(String[] args) {

        VIPCustomer cust = new VIPCustomer();

        cust.getDetails();
        cust.displayDetails();
    }
}
