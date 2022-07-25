package DZ_3_1807;

public class Task5_main {
    public static void main(String[] args) {
        Task5_Spaceship nameView = new Task5_Spaceship();
        nameView.spaceshipName = "Apollo";
        nameView.spaceshipSpeed = 1000;
        nameView.spaceshipName();
        nameView.showSpaceshipSpeed();

        Task5_Spaceship nameView2 = new Task5_Spaceship();
        nameView2.spaceshipName = "Union";
        nameView2.spaceshipSpeed = 900;
        nameView2.spaceshipName();
        nameView2.showSpaceshipSpeed();
    }
}
