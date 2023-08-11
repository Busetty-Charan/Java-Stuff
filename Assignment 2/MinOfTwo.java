import java.util.Scanner;

public class MinOfTwo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("Enter an integer : ");

        x = input.nextInt();

        System.out.print("Enter an integer again : ");

        y = input.nextInt();

        System.out.println("The greater number is " + (x > y ? x : y));

        input.close();
    }
}
