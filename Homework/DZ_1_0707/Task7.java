package DZ_1_0707;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Vvedite simvol:");
        String simvol = scanner1.nextLine();
        Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
        Matcher matlatletter = patlatletter.matcher(simvol);
        Pattern patkirletter = Pattern.compile("[а-яА-Я]{1}");
        Matcher matkirletter = patkirletter.matcher(simvol);
        Pattern patnumber = Pattern.compile("[0-9]{1}");
        Matcher matnumber = patnumber.matcher(simvol);
        if (matlatletter.matches() == true) {
            System.out.println("Lat");
        }
        else if (matkirletter.matches() == true) {
            System.out.println("Cyr");
        }
        else if (matnumber.matches() == true) {
            System.out.println("Cyfra");
        } else {
            System.out.println("Nevozmozhno opredelit");
        }
    }
}
