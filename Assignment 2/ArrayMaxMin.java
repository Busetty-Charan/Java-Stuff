import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, max = 0, min = 99999999;

        System.out.print("Enter the number of array elements : ");

        n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter positive number for index " + i + " : ");

            arr[i] = input.nextInt();

            if (arr[i] < min) {

                min = arr[i];
            }

            if (arr[i] > max) {

                max = arr[i];
            }
        }

        System.out.println("Min : " + min + " Max : " + max);

        input.close();
    }
}
