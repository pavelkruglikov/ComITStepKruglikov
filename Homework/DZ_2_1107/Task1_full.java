package DZ_2_1107;

import java.util.Scanner;

public class Task1_full {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        for (int i = 0; i <= size-1; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}