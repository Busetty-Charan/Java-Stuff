import java.util.Scanner;

public class ShapeAreas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;

        do {

            System.out.print(
                    "Please select one of the options below:\n1. Circle\n2. Triangle\n3. Rectangle\n[1 / 2 / 3] : ");

            choice = input.nextInt();
        } while (choice < 1 || choice > 3);

        switch (choice) {
            case 1:

                float radius;

                System.out.print("Enter the radius of the circle :");

                radius = input.nextFloat();

                System.out.println("The area of the given circle is : " + (3.14 * radius * radius));
                break;

            case 2:

                float base, height;

                System.out.print("Enter the base and height values of the triangle : ");

                base = input.nextFloat();
                height = input.nextFloat();

                System.out.println("The area of the given triangle is : " + ((1f / 3f) * base * height));
                break;

            case 3:

                float len, width;

                System.out.print("Ennter the length and width values of the rectangle : ");

                len = input.nextFloat();
                width = input.nextFloat();

                System.out.println("The area of the given rectangle is : " + (len * width));
                break;

            default:
                break;
        }

        input.close();
    }
}
