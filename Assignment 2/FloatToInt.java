import java.util.Scanner;

public class FloatToInt {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float x;
        int y;

        System.out.print("Enter a float number : ");

        x = input.nextFloat();
        y = (int)x;

        System.out.println("The float number entered was : " + x);
        System.out.println("The float number converted to int is : " + y);

        input.close();
    }
}