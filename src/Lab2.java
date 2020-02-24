import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Введите количество купюр номинала 30, 100, 500, 1000");
        Scanner in = new Scanner(System.in);
        int k30 = 0, k100 = 0, k500 = 0, k1000 = 0;
        int max30 = in.nextInt(), max100 = in.nextInt(),max500 = in.nextInt(), max1000 = in.nextInt();

        int sum = max1000 * 1000 + max500 * 500 + max100 * 100 + max30 * 30;

        System.out.println("Введите желаемую для получения сумму");
        int x = in.nextInt();
        if (x > sum || x<30 || (x % 10 != 0)) {
            System.out.println("Недопустимая для выдачи сумма");
        } else {
            while (x % 100 != 0 && x > 0 && max30 > 0) {
                x -= 30;
                k30++;
                max30--;
            }
            while (max1000 > 0 && x - 1000 >= 0) {
                x -= 1000;
                k1000++;
                max1000--;
            }
            while (max500 > 0 && x - 500 >= 0) {
                x -= 500;
                k500++;
                max500--;
            }
            while (max100 > 0 && x - 100 >= 0) {
                x -= 100;
                k100++;
                max100--;
            }
            if (x == 0) {
                System.out.print(k1000 + " купюр(ы) наминалом 1000, " + k500 + " купюр(ы) наминалом 500, "
                        + k100 + " купюр(ы) наминалом 100, " + k30 + " купюр(ы) наминалом 30");
            }
            else System.out.print("Недопустимая для выдачи сумма");
        }

    }
}