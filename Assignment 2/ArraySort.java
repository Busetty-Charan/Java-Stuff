import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Enter the number of array elements : ");

        n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter value at index " + i + " : ");

            arr[i] = input.nextInt();
        }

        int swaps;

        do {

            swaps = 0;

            for (int i = 0; i < n - 1; i++) {

                if (arr[i] > arr[i + 1]) {

                    arr[i + 1] += arr[i];
                    arr[i] = arr[i + 1] - arr[i];
                    arr[i + 1] -= arr[i];

                    swaps++;
                }
            }
        } while (swaps != 0);

        System.out.println("The sorted array is : " + Arrays.toString(arr));

        input.close();
    }
}
