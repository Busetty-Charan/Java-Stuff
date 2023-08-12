import java.util.Scanner;

public class MulTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num;
        num = input.nextInt();

        for (int i = 1; i <= 15; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));
        }

        input.close();
    }
}
