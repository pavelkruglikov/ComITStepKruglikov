package CW_0808;

import java.util.Scanner;

public class Task8 {
    private String readLine() {
        System.out.println("Input");
        Scanner sc1 = new Scanner(System.in);
        return sc1.nextLine();
    }

    private void showArray(String[] arrayOfString) {
        for (int i = 0; i < arrayOfString.length; i++) {
            System.out.print(arrayOfString[i]);
        }
    }


    private String[] convertToArray(String string) {
        String[] arrayOfString = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arrayOfString[i] = string.charAt(i) + "";
        }
        return arrayOfString;
    }

    boolean javaTest;

    private boolean checkingJava(String str) {

        if (str.matches(".+[A-Z].+") && !str.contains("_")) {
            javaTest = true;
            System.out.println("Its Java");
        } else if (str.contains("_") && !str.matches(".+[A-Z].+")) {
            javaTest = false;
            System.out.println("Its C++");
        } else if (str.contains("_") && str.matches(".+[A-Z].+")) {
            System.out.println("Its not java or c++");
        }
        return javaTest;
    }

    private String[] convertFromJavaToC(String[] arrayOfString, String string) {

        if (javaTest) {
            for (int i = 0; i < arrayOfString.length; i++) {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    arrayOfString[i] = "_" + arrayOfString[i].toLowerCase();
                }
            }
        } else {
            for (int i = 0; i < arrayOfString.length; i++) {
                if (arrayOfString[i].equals("_")) {
                    arrayOfString[i] = arrayOfString[i + 1].toUpperCase();
                    arrayOfString[i + 1] = "";
                }
            }
        }

        return arrayOfString;
    }


    public static void main(String[] args) {
        Task8 obj = new Task8();
        String string = obj.readLine();
        String[] arrayOfString = obj.convertToArray(string);
        obj.javaTest = obj.checkingJava(string);
        arrayOfString = obj.convertFromJavaToC(arrayOfString, string);
        obj.showArray(arrayOfString);
    }
}
