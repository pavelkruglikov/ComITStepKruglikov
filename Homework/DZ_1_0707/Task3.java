import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("input an animal ");
        Scanner scanner = new Scanner(System.in);
        String animal  = scanner.nextLine();
        switch (animal){
            case "cat": System.out.println("Meow");
                break;
            case "dog": System.out.println("Gav");
                break;
            case "cow": System.out.println("Mu");
                break;
            case "mouse": System.out.println("Pipipi");
                break;
            default: System.out.println("A ya vam seychas pokazhu otkuda gotovilos napadenie");

        }
    }
}
