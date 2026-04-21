// 2. Write a class for addition of two distance where each distance is given in m,cm,mm.

import java.util.Scanner;

class Distance {
    int m, cm, mm;

    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    void add(Distance d2) {
        int totalMM = this.mm + d2.mm;
        int carryCM = totalMM / 10;
        totalMM = totalMM % 10;

        int totalCM = this.cm + d2.cm + carryCM;
        int carryM = totalCM / 100;
        totalCM = totalCM % 100;

        int totalM = this.m + d2.m + carryM;

        System.out.println("Result: " + totalM + "m " + totalCM + "cm " + totalMM + "mm");
    }
}

public class DistanceMain {   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first distance (m cm mm):");
        int m1 = sc.nextInt();
        int cm1 = sc.nextInt();
        int mm1 = sc.nextInt();

        System.out.println("Enter second distance (m cm mm):");
        int m2 = sc.nextInt();
        int cm2 = sc.nextInt();
        int mm2 = sc.nextInt();

        Distance d1 = new Distance(m1, cm1, mm1);
        Distance d2 = new Distance(m2, cm2, mm2);

        d1.add(d2);
    }
}
