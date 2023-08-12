import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a number : ");
        num = input.nextInt();

        int palinum = 0, opernum = num;

        while (opernum != 0) {

            palinum += Math.pow((opernum % 10), 3);
            opernum /= 10;
        }

        if (palinum == num) {

            System.out.println("The given number is an armstrong number");
        } else {

            System.out.println("The given number is not an armstrong number");
        }

        input.close();
    }
}
