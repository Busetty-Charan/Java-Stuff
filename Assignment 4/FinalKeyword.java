public class FinalKeyword {

    public static void main(String[] args) {

        // Declaring a normal variable
        int x = 10;
        System.out.println(x);

        // No errors when the variable value changes
        x = 20;
        System.out.println(x);

        // Declaring a constant
        final int y = 1;
        System.out.println(y);

        // ! Error when trying to alter the value of the constant
        // y++;
        // * Therefore the final keyword can be used to lock a variable to one value
    }
}
