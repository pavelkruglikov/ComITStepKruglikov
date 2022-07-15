import java.util.Scanner;

public class Task1_empty {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner sc1 = new Scanner(System.in);
        int size  = sc1.nextInt();
        for (int i = 0; i < size; i++) {
            for (int k = size; k > i; k--) {
                System.out.print(" ");
            }
            for (int j1 = 0; j1 < i + 1; j1++) {
                if (j1 == 0 || j1 == i || i == size - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}