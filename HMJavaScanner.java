package HomeWorks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HMJavaScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Hi Type Your Number --> ");

        int date = sc.nextInt();

        System.out.println();


        System.out.print("Binary ");
        System.out.println(Integer.toBinaryString(date));

        System.out.println();

        System.out.print("Octal ");
        System.out.println(Integer.toOctalString(date));

        System.out.println();

        System.out.print("Decimal ");
        System.out.println(date);

        System.out.println();

        System.out.print("Hex ");
        System.out.println(Integer.toHexString(date));




        sc.close();


    }
}
