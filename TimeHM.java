// 5. Write a class for addition of two times where each time is given in hr,min.

import java.util.Scanner;

public class TimeHM {
    int h, m;

    TimeHM(int h, int m) {
        this.h = h;
        this.m = m;
    }

    void add(TimeHM t2) {
        int min = this.m + t2.m;
        int carry = min / 60;
        min %= 60;

        int hr = this.h + t2.h + carry;

        System.out.println("Time: " + hr + " hours " + min + " minutes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time (h m):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("Enter second time (h m):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        TimeHM t1 = new TimeHM(h1, m1);
        TimeHM t2 = new TimeHM(h2, m2);

        t1.add(t2);
    }
}