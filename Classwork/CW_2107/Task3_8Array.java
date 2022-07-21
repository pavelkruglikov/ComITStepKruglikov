package CW_2107;

import static java.lang.Math.random;

public class Task3_8Array {
    public void showFirstArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void showSecondArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0){
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Task3_8Array arrayMethod = new Task3_8Array();
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (random() * 10+1));
        }
        arrayMethod.showFirstArray(array);
        arrayMethod.showSecondArray(array);
    }
}
