import java.util.Scanner;

public class IfElseOddEven {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Enter an integer : ");

        x = input.nextInt();

        if (x % 2 == 0) {

            System.out.println("The given number is even");
        } else {

            System.out.println("The given number is odd");
        }

        input.close();
    }
}
