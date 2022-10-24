package CW_1710_TryCatch;

import java.util.Scanner;

public class FirstTaskException {

    Integer number = 0;

    public static void main(String[] args) {
        FirstTaskException firstTaskException = new FirstTaskException();
        firstTaskException.getCorrectNumberFromConsole();
        firstTaskException.verifyRange();
        System.out.println(firstTaskException.number + " number in range");
    }

    public void getCorrectNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        try {
            System.out.println("Please input a number");
            s = scanner.nextLine();
            number = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a number");
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

    public void verifyInputedNumber() throws IllegalArgumentException{
        if (number < 0 || number > 9) {
            throw new IllegalArgumentException("Not in range from  0 to 9");
        }
    }

}
