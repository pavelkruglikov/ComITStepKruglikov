package DZ_3_1807;

public class Task9_Random {
    public static void main(String[] args) {
        int amountOfNumbers = 10;
        int random;
        do {
            random = (int) (Math.random() * amountOfNumbers);
        } while (random == 0);
        int summ = 0;
        int countOfNumbers = 0;
        System.out.println("Последовательность:");
        while (random != 0) {
            System.out.print(random + " ");
            summ = random + summ;
            countOfNumbers++;
            random = (int) (Math.random() * amountOfNumbers);
        }
        System.out.println();
        System.out.println("Cредняя величина " + (float) summ / countOfNumbers);
    }
}
