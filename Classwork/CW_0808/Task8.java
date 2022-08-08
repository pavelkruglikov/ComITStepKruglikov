package CW_0808;

import java.util.Scanner;

public class Task8 {
    private String readLine() {
        System.out.println("enter");
        Scanner sc1 = new Scanner(System.in);
        return sc1.nextLine();
    }

    public void convertToC(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                String c = String.valueOf(array[i]);
                s = s.replaceAll(c, "_" + Character.toLowerCase(array[i]));
            }
        }
    }

    public void convertToJava(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_') {
                String c = String.valueOf(array[i]);
                s = s.replaceAll(c, "");
                String d = String.valueOf(array[i + 1]);
                d = d.replaceAll(c, d.toUpperCase());

            }
        }


    }
