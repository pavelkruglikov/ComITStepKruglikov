package CW_0808;

import java.util.Scanner;

public class Task7 {
    public void changeCase(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (Character.isUpperCase(s[i])) {
                s[i] = Character.toLowerCase(s[i]);
            } else if (Character.isLowerCase(s[i])) {
                s[i] = Character.toUpperCase(s[i]);
            }
        }

    }

    public void changeNumberTo(char[] s) {
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            if (Character.isDigit(c)) {
                s[i] = '_';
            }
        }

    }

    private String readLine() {
        System.out.println("Введите предложение");
        Scanner sc1 = new Scanner(System.in);
        return sc1.nextLine();
    }

    public void showArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Task7 obj = new Task7();
        String s = obj.readLine();
        char[] array = s.toCharArray();
        obj.changeCase(array);
        obj.changeNumberTo(array);
        obj.showArray(array);

    }
}


