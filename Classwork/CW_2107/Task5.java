package CW_2107;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public void showArray (int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Task5 arrayMethod = new Task5();
        Task5 arrayMethod2 = new Task5();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = 0;
        while (n <= 3) {
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n <= 3){
                    System.out.println("Введенное число должно больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int [] array1 = new int[n];
        int evenCount = 0;

        for (int i = 0; i < n; i++) {
            array1[i] = (int)(Math.random()*(n+1));
            if(array1[i]%2 == 0){
                evenCount++;
            }
        }
        arrayMethod.showArray(array1);
        int [] array2 = new int[evenCount];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(array1[i]%2 == 0){
                array2[index] = array1[i];
                index++;
            }
        }
        arrayMethod.showArray(array2);
    }
}