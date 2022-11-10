package DZ_8_0711;

public class Cycle {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{new Unicycle(),
                new Bicycle(), new Tricycle()
        };
        for (Cycle c : cycles) {
            c.ride();
            System.out.println("wheels = " + c.wheels());
        }
        }

    void ride() {
        System.out.println("Cycle.ride()");
    }

    int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Unicycle ");
    }

    @Override
    int wheels() {
        return 1;
    }

    public void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Bicycle.ride()");
    }

    @Override
    int wheels() {
        return 2;
    }

    void balance() {
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Tricycle.ride()");
    }

    @Override
    int wheels() {
        return 3;
    }
}