// 4. Write a class for addition of two times where each time is given in hr,min,sec.

import java.util.Scanner;

public class Time {
    int h, m, s;

    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void add(Time t2) {
        int sec = this.s + t2.s;
        int carryMin = sec / 60;
        sec %= 60;

        int min = this.m + t2.m + carryMin;
        int carryHr = min / 60;
        min %= 60;

        int hr = this.h + t2.h + carryHr;

        System.out.println("Time: " + hr + ":" + min + ":" + sec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time (h m s):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.println("Enter second time (h m s):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        t1.add(t2);
    }
}