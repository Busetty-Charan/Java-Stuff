import java.util.Scanner;

class Employee {

    private String empID;
    private String empName;
    private double basicSalary;
    private double grossSalary;

    public Employee() {
        empID = "";
        empName = "";
        basicSalary = 0;
        grossSalary = 0;
    }

    public void getDetails() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee ID : ");

        empID = input.next();

        System.out.print("Enter Name : ");

        empName = input.next();

        System.out.print("Enter employee basic salary : ");

        basicSalary = input.nextDouble();
    }

    public void calcSalary() {

        grossSalary = basicSalary <= 10000 ? (basicSalary + (0.2 * basicSalary) + (0.8 * basicSalary))
                : basicSalary <= 20000 ? (basicSalary + (0.25 * basicSalary) + (0.9 * basicSalary))
                        : basicSalary > 20000 ? (basicSalary + (0.3 * basicSalary) + (0.95 * basicSalary)) : 0;
    }

    public void displayDetails() {

        System.out.println("Employee ID : " + empID);
        System.out.println("Name : " + empName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Gross Salary : " + grossSalary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.getDetails();
        emp.calcSalary();
        emp.displayDetails();
    }
}
