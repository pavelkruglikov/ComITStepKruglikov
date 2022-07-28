package DZ_5_2507;

import java.util.Scanner;

public class Task4_Butterfly {
    public static void main(String[] args) {
        System.out.println("Введите ширину массива ");
        Scanner sc1 = new Scanner(System.in);
        int width = sc1.nextInt();
        System.out.println("Введите ширину массива ");
        int height = sc1.nextInt();

        int[][] butterflyArray = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0){
                    butterflyArray[i][j] = 1;
                } else butterflyArray[i][j] = 0;
            }
        }

    }
}

