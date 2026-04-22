// 8. write a class with multiple methods to perform matrix operations. 

import java.util.Scanner;

public class Matrix {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];

    // Input matrices
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();
    }

    void addition() {
        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose of Matrix A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }

  
    void sumRows() {
        System.out.println("Sum of rows (Matrix A):");
        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++)
                sum += a[i][j];
            System.out.println("Row " + i + ": " + sum);
        }
    }

  
    void sumColumns() {
        System.out.println("Sum of columns (Matrix A):");
        for (int j = 0; j < 2; j++) {
            int sum = 0;
            for (int i = 0; i < 2; i++)
                sum += a[i][j];
            System.out.println("Column " + j + ": " + sum);
        }
    }

    
    void diagonalSum() {
        int sum = 0;
        for (int i = 0; i < 2; i++)
            sum += a[i][i];

        System.out.println("Diagonal sum (Matrix A): " + sum);
    }

    public static void main(String[] args) {
        Matrix obj = new Matrix();

        obj.input();
        obj.addition();
        obj.transpose();
        obj.sumRows();
        obj.sumColumns();
        obj.diagonalSum();
    }
}