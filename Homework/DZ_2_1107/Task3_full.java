import java.util.Scanner;

public class Task3_full {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        for (int i = 0; i < size; i++) {
            //лево пусто
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            //левый треугольник
            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("*");
            }
            //правый треугольник
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}