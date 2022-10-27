package DZ_7_2410;

public class Main {
    public static String toBinary(int x)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 31; i >= 0 ; i--)
        {
            int mask = 1 << i;
            result.append((x & mask) != 0 ? 1 : 0);
        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(toBinary(99));
        System.out.println(toBinary(-99));
    }
}
