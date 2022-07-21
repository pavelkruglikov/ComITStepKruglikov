package DZ_3_1807;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task8_Velocity {

    private static final float GETDISTANCE(){
        System.out.print("Введите расстояние в метрах ");
        Scanner sc1 = new Scanner(System.in);
        float getDistance = sc1.nextFloat();
        return getDistance;
    }
    private static final float GETTIME(){
        System.out.print("Введите расстояние в минутах ");
        Scanner sc2 = new Scanner(System.in);
        float getTime = sc2.nextFloat();
        return getTime;
    }
    public static void main(String[] args) {
        float velocity = (GETDISTANCE()/GETTIME());
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.print("cкорость равняется "+df.format(velocity)+" м/с");
    }
}

