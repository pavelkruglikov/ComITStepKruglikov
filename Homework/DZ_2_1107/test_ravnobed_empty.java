import java.util.Scanner;

public class test_ravnobed_empty {
    public static void main(String[] args) {
        System.out.println("Введите размер");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        for (int i = 0; i < size; i++) {

            //Левое пустое пространство
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 < i; j1++) {
                if (j1 == 0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            //Правая часть треугольника
            for (int j = 0; j < i + 1; j++) {
                if (j == i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            //Правое пустое пространство
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}