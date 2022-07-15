import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("X coordinate ");
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();
        System.out.print("Y coordinate ");
        Scanner scanner2 = new Scanner(System.in);
        int y = scanner2.nextInt();

        if (x >= 0 && y >= 0) {
            System.out.println("I");
        } else if (x >= 0 && y < 0) {
            System.out.println("IV");
        } else if (x < 0 && y >= 0) {
            System.out.println("II");
        } else if (x < 0 && y < 0) {
            System.out.println("III");
        }




    }
}