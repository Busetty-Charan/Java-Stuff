import java.util.Scanner;

public class PrimeGen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int upperlim;

        System.out.println("Enter prime number upperlimit : ");

        upperlim = input.nextInt();

        for (int i = 2; i < upperlim; i++) {

            int flag = 0;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {

                continue;
            }

            System.out.println(i);
        }

        input.close();
    }
}
