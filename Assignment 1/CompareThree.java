public class CompareThree {
    public static void main(String args[]) {
        int a = 5;
        int b = 4;
        int c = 7;

        if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        } else if(b > c) {
            System.out.println(b + " is greatest number");
        } else {
            System.out.println(c + "is the greatest number");
        }
    }
}
