package CW_3110_Lists;

import java.util.*;

public class CreateList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(1);
        list.add(1);

        showArray(list);
        sum(list);

        list.add(2, 1);
        showArray(list);
        sum(list);

        List <Integer> list2 = new LinkedList<>();
        list2.add(9);
        list2.add(null);
        list2.add(9);

        showArray(list2);
        sum(list2);

        list2.add(2,7);
        showArray(list2);
        sum(list2);

        Set<Integer> set1 = new HashSet<>();
        set1.add(22);
        set1.add(22);
        showSet(set1);

    }

    public static<E>void sum(List<E> list) {
        int sum = 0;
        for (E s : list) {
            try {
                sum += (Integer)s;
            } catch (NullPointerException e) {
                System.out.println("Есть null значения");
            }
        }
        System.out.println("Сумма допустимых чисел = " + sum);
        System.out.println();
    }

    public static void showArray(List<Integer> list) {
        for (Integer s : list) {
            System.out.println(s);
        }
    }
    public static void showSet(Set<Integer> set1) {
        for (Integer s : set1) {
            System.out.println(s);
        }
    }
}
