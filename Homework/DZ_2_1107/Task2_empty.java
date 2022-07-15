import java.util.Scanner;

public class Task2_empty {
    public static void main(String[] args) {
        System.out.println("Введите размер");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j1 = size; j1 > i; j1--) {
                if (j1 == size || j1 == i+1 || i == 0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}