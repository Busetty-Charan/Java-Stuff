import java.util.Scanner;
import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter number of array elements : ");

        n = input.nextInt();

        int[] inarr1 = new int[n], inarr2 = new int[n], result = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter for ARRAY1 INDEX " + i + " : ");

            inarr1[i] = input.nextInt();

            System.out.print("Enter for ARRAY2 INDEX " + i + " : ");

            inarr2[i] = input.nextInt( );

            result[i] = inarr1[i] + inarr2[i];
        }

        System.out.println(Arrays.toString(result));

        input.close();
    }
}
