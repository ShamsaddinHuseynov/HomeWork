package homeworks_completed;

import java.util.Scanner;

public class IfelseMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type Number of Month: ");

        int month = sc.nextInt();

        if (month >= 1 && month <= 2)
            System.out.println("Winter");
        else if (month == 12)
            System.out.println("Winter");
        else if (month >= 3 && month <= 5)
            System.out.println("Spring");
        else if (month >= 6 && month <= 8)
            System.out.println("Summer");
        else if (month >= 9 && month <= 11)
            System.out.println("Fall");

        else
            System.out.println("Please Type 1-12 ");

            sc.close();
    }
}