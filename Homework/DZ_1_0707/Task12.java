import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Vvedite nomer bileta ");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        int b = 0;
        int i1=n/100000%10;
        int i2=n/10000%10;
        int i3=n/1000%10;
        int i4=n/100%10;
        int i5=n/10%10;
        int i6=n%10;
        if((i1+i2+i3)==(i4+i5+i6)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
                }

            }
    }