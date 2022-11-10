package DZ_8_0711.Pr5_enumCars;

public enum CarBody {
    COUPE(9,300),
    CABRIOLET(10, 500),
    SEDAN(12,600);

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int consumption;
    private int price;

    CarBody(int consumption, int price) {
        this.consumption = consumption;
        this.price = price;
    }



}
