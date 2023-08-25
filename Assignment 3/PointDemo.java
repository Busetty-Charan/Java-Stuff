import java.util.Scanner;
import java.lang.Math;

class Point {

    private int x;
    private int y;

    public Point() {

        x = 0;
        y = 0;
    }

    public Point(int x_val, int y_val) {

        x = x_val;
        y = y_val;
    }

    public void getValues() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter X co-ordinate : ");

        x = input.nextInt();

        System.out.print("Enter Y co-ordinate : ");

        y = input.nextInt();
    }

    public void displayValues() {

        System.out.println("( " + x + ", " + y + " )");
    }

    public double findDistance(Point point) {

        return (Math.pow(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2), 0.5));
    }
}

public class PointDemo {

    public static void main(String[] args) {

        Point p1 = new Point(3, 5);
        Point p2 = new Point();

        p2.getValues();
        System.out.println("The distance b/w p1 and p2 is " + p1.findDistance(p2));
    }
}
