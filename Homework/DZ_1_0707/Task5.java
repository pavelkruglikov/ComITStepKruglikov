
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Day ");
        Scanner scanner1 = new Scanner(System.in);
        int day = scanner1.nextInt();
        if (day <= 0 || day >= 32) {
            System.err.println("Incorrect day input");
            System.exit(1);
        }
        System.out.print("Month ");
        Scanner scanner2 = new Scanner(System.in);
        int month = scanner2.nextInt();

        System.out.print("Year ");
        Scanner scanner3 = new Scanner(System.in);
        int year = scanner2.nextInt();
        int yeartype =year%12;

        if (day >= 20 && day <= 31 && month == 1) {
            System.out.println("Vodoley");
        } else if (day >=1 && day <= 18 && month == 2) {
            System.out.println("Vodoley");
        } else if (day >=19 && day <=29 && month == 2) {
            System.out.println("Ryby");
        } else if (day>=1 && day<=20 && month ==3){
            System.out.println("Ryby");
        } else if (day >=21 && day <=31 && month == 3) {
            System.out.println("Oven");
        } else if (day>=1 && day<=19 && month ==4){
            System.out.println("Oven");
        } else if (day >=20 && day <=30 && month == 4) {
            System.out.println("Telec");
        } else if (day>=1 && day<=20 && month ==5){
            System.out.println("Telec");
        } else if (day >=21 && day <=31 && month == 5) {
            System.out.println("Bliznecy");
        } else if (day>=1 && day<=21 && month ==6){
            System.out.println("Bliznecy");
        } else if (day >=22 && day <=30 && month == 6) {
            System.out.println("Rak");
        } else if (day>=1 && day<=22 && month ==7){
            System.out.println("Rak");
        } else if (day >=23 && day <=31 && month == 7) {
            System.out.println("Lev");
        } else if (day>=1 && day<=22 && month ==8){
            System.out.println("Lev");
        } else if (day >=23 && day <=31 && month == 8) {
            System.out.println("Deva");
        } else if (day>=1 && day<=22 && month ==9){
            System.out.println("Deva");
        } else if (day >=23 && day <=30 && month == 9) {
            System.out.println("Vesy");
        } else if (day>=1 && day<=22 && month ==10){
            System.out.println("Vesy");
        } else if (day >=23 && day <=31 && month == 10) {
            System.out.println("Scorpion");
        } else if (day>=1 && day<=21 && month ==11){
            System.out.println("Scorpion");
        } else if (day >=22 && day <=30 && month == 11) {
            System.out.println("Stelec");
        } else if (day>= 1 && day<=21 && month ==12){
            System.out.println("Strelec");
        } else if (day >=22 && day <=31 && month == 12) {
            System.out.println("Kozerog");
        } else if (day>=1 && day<=19 && month ==1){
            System.out.println("Kozerog");
        }
        switch (yeartype) {
            case 0:
                System.out.println("Obezyana");
                break;
            case 1:
                System.out.println("Petuh");
                break;
            case 2:
                System.out.println("Sobaka");
                break;
            case 3:
                System.out.println("Svinya");
                break;
            case 4:
                System.out.println("Krysa");
                break;
            case 5:
                System.out.println("Byk");
                break;
            case 6:
                System.out.println("Tigr");
                break;
            case 7:
                System.out.println("Zayac");
                break;
            case 8:
                System.out.println("Dracon");
                break;
            case 9:
                System.out.println("Zmeya");
                break;
            case 10:
                System.out.println("Loshad");
                break;
            case 11:
                System.out.println("Ovca");
                break;
            default:
                System.out.println("Error");
        }


    }
}




