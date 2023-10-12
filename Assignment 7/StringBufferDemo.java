public class StringBufferDemo {

    public static void main(String[] args) {

        String string_to_mod = "Not Modded";
        StringBuffer buffer_string = new StringBuffer(string_to_mod);

        // * StringBuffer class is a thread-safe drop-in replacement of StringBuilder
        // * class

        // * We use these classes because they are mutable and don't waste precious
        // * compute time

        // Let's append some stuff to our string
        buffer_string.append(" ");
        System.out.println(buffer_string);

        buffer_string.append(69420);
        System.out.println(buffer_string);

        buffer_string.append(true);
        System.out.println(buffer_string);

        // Let's delete a part of the string
        buffer_string.delete(0, 4);
        System.out.println(buffer_string);

        // Since the buffer has dynamic capacity, we can check its current capacity
        System.out.println(buffer_string.capacity());

        // It's possible to even extract substrings from the main string
        System.out.println(buffer_string.substring(0, 6));
    }
}
