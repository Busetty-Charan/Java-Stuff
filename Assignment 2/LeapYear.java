import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;

        System.out.println("Please enter an year to check for leap : ");

        year = input.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {

            System.out.println("The year " + year + " is a leap year");
        } else {

            System.out.println("The year " + year + " is not a leap year");
        }

        input.close();
    }
}
