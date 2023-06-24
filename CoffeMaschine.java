package homeworks_completed;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;
public class CoffeMaschine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Chose your Coffee: (Type - 1 for Эспрессо Type - 2 for Американо Type - 3 for Капучино Type - 4 for Чай) ");
        int coffee = sc.nextInt();
        sc.close();
        switch (coffee) {
            case 1:
                System.out.println("Эспрессо - неразделимый процесс");
                break;
            case 2:
                System.out.println("Американо - эспрессо + добавление воды");
                break;
            case 3:
                System.out.println("Капучино - эспрессо + добавление вспененного молока");
                break;
            case 4:
                System.out.println("Чай - вода + пакетик чая");
                break;
            default:
                System.out.println("Error");
        }
    }
}
