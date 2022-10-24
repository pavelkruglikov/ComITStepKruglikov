package CW_1710_Calculation2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int[] arrayOfNumbers;


    public static void main(String[] args) {
        System.out.println("Please input math example with +");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        char[] result = s.toCharArray();

        Main start = new Main();
        start.analyzeString(result);
        start.getArrayOfNumbers(s);
        start.getCalculation();
    }

    public void getArrayOfNumbers(String s) {
        String[] tempNumbers = s.split("\\+");
        arrayOfNumbers = new int[tempNumbers.length];
        for (int i = 0; i < tempNumbers.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(tempNumbers[i]);
        }

    }

    public void analyzeString(char[] result) {
        for (int i = 0; i < result.length; i++) {
            switch (result[i]) {
                case '+':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    continue;
                default:
                    throw new IllegalStateException("Unexpected value: " + result[i]);
            }
        }
    }

    public void getCalculation() {
        int sum = 0;
        for (int x : arrayOfNumbers
        ) {
            sum += x;
        }
        System.out.println("Result is " + sum);

    }
}
