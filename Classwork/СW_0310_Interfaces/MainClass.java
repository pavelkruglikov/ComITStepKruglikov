package СW_0310_Interfaces;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Automobile> automobiles = new ArrayList<>();
        automobiles.add(new Car("Жигули", "Седан"));
        automobiles.add(new Car("Москвич", "Седан"));
        automobiles.add(new Truck("Газель", "Грузовик"));
        for (Automobile a: automobiles) {
            System.out.println(a);
        }

        System.out.println(automobiles.get(0).isAutomobile());

    }
}