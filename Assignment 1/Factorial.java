public class Factorial {
    public static void main(String args[]) {
        int a = 5;
        int copy = a;
        int fact = 1;

        while (a != 1) {
            fact *= a;
            a--;
        }

        System.out.println("The factorial of " + copy + " is " + fact);
    }
}
