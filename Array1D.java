// 7. Write a class that is having four method for 1-dimensional array. (Input, output 1,out2, reverse).

import java.util.Scanner;

public class Array1D {
    int arr[] = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
    }

    void output1() {
        System.out.println("Array (for loop):");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


    void output2() {
        System.out.println("\nArray (for-each loop):");
        for (int x : arr)
            System.out.print(x + " ");
    }


    void reverse() {
        System.out.println("\nReversed array:");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Array1D obj = new Array1D();
        obj.input();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}