import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите число, которое необходимо развернуть");
        Scanner sc1 = new Scanner(System.in);
        int number = sc1.nextInt();
        int count = 0;
        while (number != 0) {
            count = count * 10 + (number % 10);
            number = number / 10;
        }
        System.out.println(count);
    }
}