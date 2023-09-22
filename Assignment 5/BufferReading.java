import java.io.*;

public class BufferReading {

    public static void main(String[] args) {

        // ! For BufferReader to work, it is important to enclose the object in
        // ! a try-catch block or with a try-with-resources block because it is
        // ! important to close the resources at the end to prevent memory leak

        // * In this code, it's done using try-with-resources block

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String example = reader.readLine();
            System.out.println("The line read was : " + example);

            int exint = Integer.parseInt(reader.readLine());
            System.out.println("The integer read was : " + exint);
        } catch (IOException e) {

            System.out.println("IO Exception has occured, program cannot read anything from input stream!");
        }
    }
}
