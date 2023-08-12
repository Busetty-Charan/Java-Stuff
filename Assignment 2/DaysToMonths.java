import java.util.Scanner;

public class DaysToMonths {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of days : ");

        int days;
        days = input.nextInt();

        System.out.println("There are " + (days / 30) + " months and " + (days % 30) + " days");

        input.close();
    }
}
