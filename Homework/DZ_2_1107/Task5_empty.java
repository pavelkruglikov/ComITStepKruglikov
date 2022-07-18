package DZ_2_1107;

import java.util.Scanner;

public class Task5_empty {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        for (int j = 0; j < 2 * size - 1; j++) {
            if (j >= size - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 1; i < size - 1; i++) {
            for (int j = 0; j < 2 * size - i; j++) {
                if (j == size - i - 1 || j == (2 * size) - i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int j = 1; j < 2 * size; j++) {
            if (j <= size) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}