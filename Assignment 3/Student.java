import java.util.Scanner;
import java.util.Arrays;

public class Student {

    int marks[] = new int[5], total, average;
    String regNo, name;

    void getDetails() {

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

    void printDetails() {

        System.out.println("Name : " + name);
        System.out.println("Register Number : " + regNo);
        System.out.println(Arrays.toString(marks));
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
    }

    public static void main(String[] args) {

        Student stu = new Student();

        stu.getDetails();
        stu.printDetails();
    }
}
