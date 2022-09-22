package DZ_6_0109;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [] two = {1,2,3,4};
        int [][] three = {
                {10,11,12,13,14},
                {15,16,17,18,19},
                {20,21,22,23,24}
        };

        System.arraycopy(two, 0, three[2], 1, 4);
        three[1] = two;

        for (int i = 0; i < three.length; i++) {
            for (int j = 0; j < three[i].length; j++) {
                System.out.print(three[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(three[2]));
        System.out.println(Arrays.toString(two));
    }
}
