import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Input starting X coordinate ");
        Scanner scanner1 = new Scanner(System.in);
        int x1 = scanner1.nextInt();
        System.out.print("Input starting Y coordinate ");
        Scanner scanner2 = new Scanner(System.in);
        int y1 = scanner2.nextInt();
        System.out.print("Input ending X coordinate ");
        Scanner scanner3 = new Scanner(System.in);
        int x2 = scanner1.nextInt();
        System.out.print("Input ending Y coordinate ");
        Scanner scanner4 = new Scanner(System.in);
        int y2 = scanner2.nextInt();
        if (x2 > x1 && y2 > y1) {
            System.out.println("Pod'em");
        } else if (x2 > x1 && y2 < y1) {
            System.out.println("Spusk");
        } else if (x2 >= x1 && y2 == y1) {
            System.out.println("Rovnaya");
        } else if (x2 < x1) {
            System.out.println("Otvesnaya");
        }
    }
}
