import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] marksarr = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter marks for subject " + i + " : ");

            marksarr[i] += input.nextInt();
            total += marksarr[i];
        }

        System.out.println("The total is " + total + " and the average is " + ((float)total / 5f));

        for (int i = 0; i < 5; i++) {

            System.out.println("The grade for subject " + i + " is " + (
                marksarr[i] > 95 ? "S" :
                marksarr[i] > 90 ? "A+" :
                marksarr[i] > 80 ? "A" :
                marksarr[i] > 70 ? "B" :
                marksarr[i] > 60 ? "C" :
                marksarr[i] > 50 ? "D" : "F"
            ));
        }

        input.close();
    }
}
