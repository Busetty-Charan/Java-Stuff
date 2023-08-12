public class WeirdSum {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 100; i < 200; i += 2){

            if (i % 4 == 0) {

                sum += i;
            }
        }

        System.out.println("The sum is : " + sum);
    }
}
