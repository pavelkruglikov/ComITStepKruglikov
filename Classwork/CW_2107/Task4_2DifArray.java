package CW_2107;

import static java.lang.Math.random;

public class Task4_2DifArray {
    public void showFirstArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    public int getAverage(int[] array1) {
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        int average = sum1 / array1.length;
        return average;
    }

    public static void main(String[] args) {
        Task4_2DifArray arrayMethod = new Task4_2DifArray();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (random() * 5 + 1));
            array2[i] = ((int) (random() * 5 + 1));
        }
        arrayMethod.showFirstArray(array1);
        int averageFirstArray = arrayMethod.getAverage(array1);
        System.out.println(averageFirstArray);
        arrayMethod.showFirstArray(array2);
        int averageSecondArray = arrayMethod.getAverage(array2);
        System.out.println(averageSecondArray);
        arrayMethod.showComparasionOfAverages(averageFirstArray,averageSecondArray);

    }
    public void showComparasionOfAverages (int averageFirstArray, int averageSecondArray){
        if (averageFirstArray>averageSecondArray){
            System.out.println("First");
            return;
        } else if (averageFirstArray < averageSecondArray) {
            System.out.println("Second");
            return;
        }
        System.out.println("ravno");
    }
}
