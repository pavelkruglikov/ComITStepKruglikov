package DZ_3_1807;

import java.util.Random;

public class Task7_Coinflipping {
    public static void main(String[] args) {
        Random coinFlip = new Random();
        int side = coinFlip.nextInt(2) + 1;
        if (side == 2) {
            System.out.println("Решка");
        } else {
            System.out.println("Орёл");
        }
    }
}