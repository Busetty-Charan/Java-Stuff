public class BasicErrorHandling {

    public static void main(String[] args) {

        // Deliberately send an actual string to Int parser
        int example = 0;

        try {

            example = Integer.parseInt("Apple");
        } catch (NumberFormatException e) {

            System.out.println("The parsed string had characters other than numbers");
        }

        System.out.println(example);
    }
}
