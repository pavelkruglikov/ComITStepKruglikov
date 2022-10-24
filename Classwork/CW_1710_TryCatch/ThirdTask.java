package CW_1710_TryCatch;

import java.util.Arrays;


public class ThirdTask {
    public static void main(String[] args) {
        ThirdTask start = new ThirdTask();
        start.compare();

    }

    public void compare(){
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 9, 0};

        try {
            Arrays.compare(array1, 8, 4, array2, 2, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Плохо");
        }

    }

}
