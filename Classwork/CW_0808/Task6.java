package CW_0808;

public class Task6 {

    public int exceptionNumbers(String[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("13") || array[i].contains("4")) {
                index++;
            }

        }
        return index;
    }

    public String[] Numbers() {
        String[] array = new String[100000];
        for (int i = 0; i < array.length; i++) {
            if (i < 10) {
                array[i] = "00000" + i;
            } else if (i < 100) {
                array[i] = "0000" + i;
            } else if (i < 1000) {
                array[i] = "000" + i;
            } else if (i < 10000) {
                array[i] = "00" + i;
            } else {
                array[i] = "" + i;
            }
        }
        return array;
    }

    public void showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Task6 toShow = new Task6();
        String[] finalArray = toShow.Numbers();
        int count = toShow.exceptionNumbers(finalArray);
        System.out.println("Удалено " + count);


    }
}

