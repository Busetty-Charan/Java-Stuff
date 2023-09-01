class Methods {

    // Finds the area of a circle
    public double findArea(double radius) {

        return (3.14 * radius * radius);
    }

    // Finds the area of a rectangle
    public double findArea(double l, double b) {

        return (l * b);
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        // Demo of function overloading
        Methods obj = new Methods();

        System.out.println(obj.findArea(5));
        System.out.println(obj.findArea(5, 5));
    }
}
