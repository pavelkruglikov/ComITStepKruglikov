package CW_2107;

import java.util.Scanner;

public class Task1_HowMany {
    public String sentence() {
        System.out.println("Введите предложение");
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();
        return input;
    }

    public static void main(String[] args) {
        Task1_HowMany sentenceToCount = new Task1_HowMany();
        int count = 0;
        String resultOfMethod = sentenceToCount.sentence();
        if (resultOfMethod.length() != 0) {
            count++;
        }
        for (int i = 0; i < resultOfMethod.length(); i++) {
            if (resultOfMethod.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Количество слов " +count);
        }
}
