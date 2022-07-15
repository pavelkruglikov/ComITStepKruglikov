import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Vvedity nomer kvartiry ");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        System.out.print("Vvedite kolichestvo kvartir na etazhe ");
        Scanner scanner2 = new Scanner(System.in);
        int m = scanner2.nextInt();
        System.out.println("Pod'ezd "+(n/(9*m)+1));
    }
}
