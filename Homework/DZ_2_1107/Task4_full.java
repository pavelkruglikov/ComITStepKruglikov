package DZ_2_1107;

import java.util.Scanner;

public class Task4_full {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        for (int i = 0; i < size; i++){
            //лево верх пусто
            for (int j = size; j > i; j--){
                System.out.print(" ");
            }
            //левый верхний треугольник
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("*");
            }
            //правый верхний треугольник
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            //право верх пусто
            for (int j = size; j > i; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = size; i >= 0; i--){
            //лево низ пусто
            for (int j = size; j > i; j--){
                System.out.print(" ");
            }
            //левый нижний треугольник
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("*");
            }
            //правый нижний треугольник
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            //право низ пусто
            for (int j = size; j > i; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}