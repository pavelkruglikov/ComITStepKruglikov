package DZ_2_1107;

import java.util.Scanner;

public class Task5_full {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= size; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}