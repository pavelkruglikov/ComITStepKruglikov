package DZ_7_2410;

public class Pr1_Compare {

    long totalTimePrim;
    long totalTimeWrapper;

    public static void main(String[] args) {
        Pr1_Compare start = new Pr1_Compare();
        start.operationWithPrim();
        start.operationWithWrapper();
        start.compareOfMethods();
    }

    public void operationWithPrim() {
        long startTime1 = System.currentTimeMillis();
        System.out.println("Запуск программы c примитивными типами :" + startTime1 + " мс");
        int x = 2;
        int y = 3;
        for (int i = 1; i < 1000000; i++) {
            int z = y + x;
        }
        long endTime1 = System.currentTimeMillis();
        totalTimePrim = endTime1 - startTime1;
        System.out.println("Окончание программы: " + endTime1 + " мс");
        System.out.println("Время выполнения равно: " + totalTimePrim + " мс");

    }

    public void operationWithWrapper() {
        long startTime2 = System.currentTimeMillis();
        System.out.println("Запуск программы с классами-оболочками: " + startTime2 + " мс");
        Integer a = 2;
        Integer b = 3;
        for (int i = 1; i < 1000000; i++) {
            int z = a + b;
        }
        long endTime2 = System.currentTimeMillis();
        totalTimeWrapper = endTime2 - startTime2;
        System.out.println("Окончание программы: " + endTime2 + "ms");
        System.out.println("Время выполнения равно: " + totalTimeWrapper + "ms");
    }

    public void compareOfMethods() {
        if (totalTimeWrapper < totalTimePrim) {
            System.out.println("Выполнение метода с классами оболочками быстрее на: " + (totalTimePrim - totalTimeWrapper));

        } else {
            System.out.println("Выполнение метода с примитивными типами быстрее на: " + (totalTimeWrapper - totalTimePrim) + " мс");

        }

    }
}




