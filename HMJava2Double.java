package HomeWorks;

import java.util.Scanner;

public class HMJava2Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.print("Type First 'Double'number --> ");

        double x = sc.nextDouble();

        System.out.print("Type Second 'Double' number --> ");

        double y = sc.nextDouble();


        double w = x * y;

        int r = (int) w;

        System.out.println(r);

        sc.close();
    }
}
