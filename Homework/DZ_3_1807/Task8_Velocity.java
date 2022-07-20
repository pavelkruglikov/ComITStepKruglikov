package DZ_3_1807;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task8_Velocity {
    final float CONSTDISTANCE = getDistance();
    final float CONSTTIME = getTime();
    final float CONSTVELOCITY = CONSTDISTANCE/CONSTTIME;

    private float getDistance() {
        System.out.print("Введите расстояние в метрах ");
        Scanner sc1 = new Scanner(System.in);
        float getDistance = sc1.nextFloat();
        return getDistance;
    }
    private final float getTime() {
        System.out.print("Введите расстояние в минутах ");
        Scanner sc2 = new Scanner(System.in);
        float getTime = sc2.nextFloat();
        return getTime;
    }
    public static void main(String[] args) {
            Task8_Velocity vel = new Task8_Velocity();
            DecimalFormat df = new DecimalFormat("##.##");
            System.out.println("При расстоянии " + vel.CONSTDISTANCE + " и времени " + vel.CONSTTIME);
            System.out.print("cкорость равняется "+df.format(vel.CONSTVELOCITY)+" м/с");
    }
}

