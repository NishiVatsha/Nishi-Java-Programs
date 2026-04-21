// 3. Write a class for addition of two distance where each distance is given in m,cm.

import java.util.Scanner;

class Distance {
    int m, cm;

    Distance(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }

    void add(Distance d2) {
        int totalCM = this.cm + d2.cm;

        int carryM = totalCM / 100;
        totalCM = totalCM % 100;

        int totalM = this.m + d2.m + carryM;

        System.out.println("Result: " + totalM + "m " + totalCM + "cm");
    }
}

public class Distance2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter first distance (m cm):");
        int m1 = sc.nextInt();
        int cm1 = sc.nextInt();

        System.out.println("Enter second distance (m cm):");
        int m2 = sc.nextInt();
        int cm2 = sc.nextInt();

        Distance d1 = new Distance(m1, cm1);
        Distance d2 = new Distance(m2, cm2);

        d1.add(d2);
    }
}