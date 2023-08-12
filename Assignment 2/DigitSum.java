import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a number : ");
        num = input.nextInt();

        int palinum = 0, opernum = num;

        while (opernum != 0) {

            palinum += (opernum % 10);
            opernum /= 10;
        }

        System.out.println("The sum of the digits of " + num + " is : " + palinum);

        input.close();
    }
}
