public class StringFunctions {

    public static void main(String[] args) {

        String string_example = "This is an example string. Oh look there's whitespace at the end     ";

        // Printing out the string normally
        System.out.println(string_example);

        // There's a function that returns the string length
        System.out.println(string_example.length());

        // Oh, look, you can manipulate the cases
        System.out.println(string_example.toLowerCase());
        System.out.println(string_example.toUpperCase());

        // I guess you can get a character at a particular index in the string
        System.out.println(string_example.charAt(7));

        // You can also get the starting index of a substring
        System.out.println(string_example.indexOf("look"));

        // Let's just attach another string to our string
        System.out.println(string_example.concat("This string was attached just now"));

        // There's a lot more functions you can play around with, just check the functions
        // available in the String class docs. I don't know why I am writing comments too
    }
}
