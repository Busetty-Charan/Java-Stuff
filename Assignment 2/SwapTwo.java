import java.util.Scanner;

public class SwapTwo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Enter an integer : ");

        x = input.nextInt();

        System.out.print("Enter an integer again : ");

        y = input.nextInt();

        System.out.println("X and Y before swapping : " + x + " " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("X and Y after swapping : " + x + " " + y);

        input.close();
    }
}