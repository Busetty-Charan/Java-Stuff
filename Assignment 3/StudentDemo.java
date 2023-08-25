import java.util.Scanner;
import java.util.Arrays;

class Student {

    private int marks[] = new int[5];
    private int total;
    private int average;
    private String regNo;
    private String name;

    public void getDetails() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name : ");

        name = input.next();

        System.out.print("Enter regNo : ");

        regNo = input.next();

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter marks in subject " + i + " : ");

            marks[i] = input.nextInt();
            total += marks[i];
        }

        average = total / 5;
    }

    public void printDetails() {

        System.out.println("Name : " + name);
        System.out.println("Register Number : " + regNo);
        System.out.println(Arrays.toString(marks));
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student stu = new Student();

        stu.getDetails();
        stu.printDetails();
    }
}
