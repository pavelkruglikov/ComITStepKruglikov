package DZ_5_2507;

import java.util.Arrays;

import static java.lang.Math.random;

public class Task3_Reverse {
    public void showArray(int[] array) {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Task3_Reverse arrayMethod = new Task3_Reverse();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (random() * 10 + 1));
        }
        arrayMethod.showArray(array);
        arrayMethod.reverse(array);

    }
}