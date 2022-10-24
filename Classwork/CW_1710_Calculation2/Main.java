package CW_1710_Calculation2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input math example with +");
        String s = scanner.nextLine();
        char[] result = s.toCharArray();
        Main start = new Main();
        start.getCorrectNumberFromConsole(result);
        start.getCalculation(s);
    }


    public void getCorrectNumberFromConsole(char[] result) {
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

    public void getArrayOfNumbers(String s) {
        int position = 0;
        while (position < s.length()) {
            char c = s.charAt(position);
            switch (c) {
                case '+':
                    continue;
                default:
                    if (c <= '9' && c >= '0'){
                        StringBuilder sb = new StringBuilder();
                        do {
                            sb.append(c);
                            position++;
                            if (position >= s.length()) {
                                break;
                            }
                            c = s.charAt(position);
                        } while (c <= '9' && c >= '0');
                        sb.toString();

                    } else {
                        if (c != ' ') {
                            throw new RuntimeException("Unexpected character: " + c);
                        }
                        position++;
                    }
            }
        }
    }

    public void getCalculation(String s) {

        int[] array = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                continue;
            } else {
                array[i] = s.charAt(i) - '0';
                sum += array[i];
            }


        }
        System.out.println("Result is " + sum);

    }
}
