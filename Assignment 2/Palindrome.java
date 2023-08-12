import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a number : ");
        num = input.nextInt();

        int palinum = 0, opernum = num;

        while (opernum != 0) {

            palinum = (palinum * 10) + (opernum % 10);
            opernum /= 10;
        }

        if (palinum == num) {

            System.out.println("The number is a palindrome");
        } else {

            System.out.println("The number is not a palindrome");
        }

        input.close();
    }
}
