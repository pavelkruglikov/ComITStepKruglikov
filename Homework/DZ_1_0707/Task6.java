import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Vvedite god ");
        Scanner scanner1 = new Scanner(System.in);
        int year = scanner1.nextInt();
        int yearcount1 = year%4;
        int yearcount2 = year%400;

        if(yearcount1>0){
            System.out.println("365");}
        else if (yearcount2==0){
            System.out.println(365);}
        else {
            System.out.println(366);
        }

    }
}
