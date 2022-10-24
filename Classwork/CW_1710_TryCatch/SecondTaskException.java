package CW_1710_TryCatch;

import java.util.Scanner;

public class SecondTaskException {


    Integer number = 0;

    public static void main(String[] args) {
        SecondTaskException firstTaskException = new SecondTaskException();
        firstTaskException.getCorrectNumberFromConsole();
        firstTaskException.verifyRange();
        System.out.println(firstTaskException.number + " number in range");
    }

    public void getCorrectNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        try {
            System.out.println("Please input binary number");
            s = scanner.nextLine();
            number = Integer.parseInt(s, 2);
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a number or not binary");
            getCorrectNumberFromConsole();
        }
    }

    public void verifyRange() {
        try {
            verifyInputedNumber();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getCorrectNumberFromConsole();
            verifyRange();
        }
    }

    public void verifyInputedNumber() throws IllegalArgumentException {
        if (number < -5 || number > 5) {
            throw new IllegalArgumentException("Not in range from  -5 to 5");
        }
    }

}

