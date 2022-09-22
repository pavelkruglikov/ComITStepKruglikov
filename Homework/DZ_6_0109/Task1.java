package DZ_6_0109;

public class Task1 {
    public static void main(String[] args) {
        Integer integerNumber = 9;
        Double doubleNumber = 7.9;

        System.out.println("Objects output: " + integerNumber + ", " + doubleNumber);

        String a = "777";
        integerNumber = Integer.valueOf(a);
        System.out.println(integerNumber + doubleNumber);

        int i = doubleNumber.intValue();
        System.out.println(i);

        i = Integer.parseInt(a);
        System.out.println(i);
    }
}
