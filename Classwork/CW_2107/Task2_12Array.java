package CW_2107;

import static java.lang.Math.random;

public class Task2_12Array {
    public void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task2_12Array arrayMethod = new Task2_12Array();
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (random() * 31) - 15);
        }
        arrayMethod.showArray(array);
        int maxNumber = arrayMethod.getMaxNumber(array);
        int indexOfMaxNumber = arrayMethod.getIndexOfMaxNumber(array, maxNumber);
        System.out.println("Индекс максимального числа " + indexOfMaxNumber);
    }

    public int getMaxNumber(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i]) {
                maxNumber = array[i];
            }
        }
        System.out.println("Максимальное число " + maxNumber);
        return maxNumber;
    }

    public int getIndexOfMaxNumber(int[] array, int maxNumber) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNumber) {
                index = i;
            }
        }
        return index;
    }
}
