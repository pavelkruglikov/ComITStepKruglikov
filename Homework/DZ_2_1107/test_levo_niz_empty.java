import java.util.Scanner;

public class test_levo_niz_empty {
    public static void main(String[] args) {
        System.out.println("Введите размер");
        Scanner sc1 = new Scanner(System.in);
        int count = sc1.nextInt();
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                if (k == i || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("5");
                }
            }
            System.out.println("7");
        }

    }
}