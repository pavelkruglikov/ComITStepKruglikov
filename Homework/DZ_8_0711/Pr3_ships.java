package DZ_8_0711;

public class Pr3_ships {

    public static void main(String[] args) {
        Spaceship spaceship1 = new Spaceship("SportSpaceShip");
        System.out.println(spaceship1.name);
        Spaceship.Engine launch = spaceship1.new Engine();
        launch.start();
        Spaceship.ControlPanel move = spaceship1.new ControlPanel();
        move.up();
        System.out.println();

        Spaceship spaceship2 = new Spaceship("WarSpaceShip");
        System.out.println(spaceship2.name);
        launch.stop();
        move.down();
        System.out.println();

        Spaceship spaceship3 = new Spaceship("AvtozakSpaceShip");
        System.out.println(spaceship3.name);
        launch.start();
        move.left();
        System.out.println();
    }
}

class Spaceship {
    String name;

    public Spaceship(String name) {
        this.name = name;
    }

    class Engine {
        public void start() {
            System.out.println("Engine is started");
        }

        public void stop() {
            System.out.println("Engine is stop");
        }

    } class ControlPanel {
        public void up(){
            System.out.println("Move up");
        }
        public void down(){
            System.out.println("Move down");
        }
        public void left(){
            System.out.println("Move left");
        }
        public void right(){
            System.out.println("Move right");
        }
    }
}
