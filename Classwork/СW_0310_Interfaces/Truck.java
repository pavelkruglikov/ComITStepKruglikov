package СW_0310_Interfaces;

public class Truck extends Automobile implements isTruck{
    public Truck(String name, String type) {
        super(name, type);
    }

    @Override
    public boolean isTruck() {
        return true;
    }
}