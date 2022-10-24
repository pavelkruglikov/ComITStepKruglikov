package СW_0310_Interfaces;

public class Automobile implements isAutomobile {
    String name;
    String type;

    @Override
    public boolean isAutomobile() {
        return true;
    }

    public Automobile(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Машина " + name + " кузов " + type;
    }
}