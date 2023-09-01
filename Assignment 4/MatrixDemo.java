import java.util.Scanner;
import java.util.Arrays;

class Matrix {

    private int matrix[][];

    public Matrix(int rows, int cols) {

        matrix = new int[rows][cols];
    }

    public void getMatrix() {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print("Enter the matrix element at [" + i + "] [" + j + "] : ");
                input.nextInt();
            }
        }
    }

    public void displayMatrix() {

        for (int i = 0; i < matrix.length; i++) {

            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public boolean equal(Matrix m2) {

        if (matrix.length == m2.matrix.length && matrix[1].length == m2.matrix[1].length) {

            for (int i = 0; i < matrix.length; i++) {

                for (int j = 0; j < matrix[i].length; j++) {

                    if (matrix[i][j] != m2.matrix[i][j]) {

                        return false;
                    }
                }
            }
        } else {

            return false;
        }

        return true;
    }
}

public class MatrixDemo {
    
    public static void main(String[] args) {
        
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        m1.getMatrix();
        System.out.println();
        m2.getMatrix();
        System.out.println();

        m1.displayMatrix();
        System.out.println();
        m2.displayMatrix();
        System.out.println();

        System.out.println(m1.equal(m2));
    }
}
