package CW_0311_CollectionsAndMaps;

import java.util.*;

public class ArrayMain {
    Scanner scanner = new Scanner(System.in);
    private List<Integer> integerArrayList = new ArrayList<>();
    private Map<Integer, String> menu = new HashMap<>();
    private boolean endFlag = true;

    public static void main(String[] args) {
        ArrayMain obj = new ArrayMain();
        obj.integerArrayList.add(obj.scanNumber());
        obj.integerArrayList.add(obj.scanNumber());
        obj.integerArrayList.add(obj.scanNumber());

        obj.generateMenu();

        do {
            obj.controller();
        } while (obj.endFlag);

    }


    public int scanNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public void generateMenu() {
        menu.put(1, "Add element in the list");
        menu.put(2, "Delete element from list");
        menu.put(3, "Show all elements in the list");
        menu.put(4, "Check value in the list");
        menu.put(5, "Replace value in the list");
        menu.put(6, "Exit");
    }

    public void showMenu() {
        for (int i = 1; i < menu.size() + 1; i++) {
            System.out.println("\n" + i + ". " + menu.get(i));
        }
    }

    public int getMenuPointer() {
        System.out.println("Enter menu point");
        return scanner.nextInt();
    }

    public void controller() {
        showMenu();
        int menuPoint = getMenuPointer();
        switch (menuPoint) {
            case 1: {
                addElement(scanNumber());
                break;
            }
            case 2: {
                deleteElement(scanNumber());
                break;
            }
            case 3: {
                showAllElements();
                break;
            }
            case 4: {
                checkValue(scanNumber());
                break;
            }
            case 5 : {
                replaceValues(scanNumber(), scanNumber());
                break;
            }
            case 6: {
                endFlag = false;
            }
        }
    }

    public void addElement(int element) {
        integerArrayList.add(element);
        System.out.println("Element " + element + " added");
    }

    public void deleteElement(int element) {
        integerArrayList.remove(element);
        System.out.println("Element " + element + " removed");
    }

    public void showAllElements() {
        System.out.println("Arraylist contains: ");
        for (int a : integerArrayList) {
            System.out.print(a + " ");
        }
    }

    public void checkValue(int element) {
        if (integerArrayList.contains(element)) {
            System.out.println("Arraylist contains " + element);
        } else {
            System.out.println("Arraylist not contains " + element);
        }
    }

    public void replaceValues(int index, int element) {
        integerArrayList.set(index, element);
        System.out.println("Replaced element " + element);
    }
}
