import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Input time ");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        if (time >= 0 && time < 6) {
            System.out.println("good night");
        } else if (time > 6 && time < 12) {
            System.out.println("good morning");
        } else if (time > 12 && time < 17) {
            System.out.println("good afternoon");
        } else if (time > 17 && time < 23) {
            System.out.println("good evening");
        } else if (time > 24) {
            System.out.println("Hello");
        }
    }
}