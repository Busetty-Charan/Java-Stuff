public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int result = 0;

        System.out.println("1");

        for (int i = 0; i < 10; i++) {
            result = first + second;
            first = second;
            second = result;

            System.out.println(result);
        }
    }
}
