package CW_1710_Calculation2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main start = new Main();
        start.getCorrectNumberFromConsole();
        start.getCalculation();
    }


    public void getCorrectNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input math example with +");
        String s = scanner.nextLine();
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            switch (result[i]) {
                case '+':
                case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
                    continue;
                default:
                    throw new IllegalStateException("Unexpected value: " + result[i]);
            }
        }
    }

    public void getCalculation() {
        int sum = 0;
        for (int i = 0; i < result.length; i++) {

            if (result[i] <= '9' && result[i] >= '0') {
                sum = sum + result[i];
            } else {
                i++;
            }
        }
        System.out.println(sum);
    }

}
