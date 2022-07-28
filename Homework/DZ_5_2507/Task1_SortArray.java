package DZ_5_2507;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_SortArray {
    public static void main(String args[]) {
        int size = 10;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Введите 10 чисел массива");

        for(int i = 0; i<size; i++) {
            array[i] = sc.nextInt();
        }

        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
