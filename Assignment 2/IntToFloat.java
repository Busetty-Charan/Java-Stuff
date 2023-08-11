import java.util.Scanner;

public class IntToFloat {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x;
        float y;

        System.out.print("Enter an int number : ");

        x = input.nextInt();
        y = (float)x;

        System.out.println("The int number entered was : " + x);
        System.out.println("The int number converted to float is : " + y);

        input.close();
    }
}