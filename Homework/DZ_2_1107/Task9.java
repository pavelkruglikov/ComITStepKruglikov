import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Введите высоту ");
        Scanner sc1 = new Scanner(System.in);
        int height = sc1.nextInt();
        System.out.print("Введите размер ");
        Scanner sc2 = new Scanner(System.in);
        int count = sc2.nextInt();
        for (int i = 0; i < height; i++) {
            //лево пусто
            for (int j = height+count; j > i; j--) {
                System.out.print("1");
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