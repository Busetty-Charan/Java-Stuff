import java.util.Scanner;

public class SwitchOddEven {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Enter an integer : ");

        x = input.nextInt();

        switch (x%2) {
            case 0:
                
                System.out.println("The given number is even");
                break;

            case 1:

                System.out.println("The given number is odd");
                break;
        
            default:
                break;
        }

        input.close();
    }
}
