package DZ_3_1807;

public class Task5_Spaceship {
    String nameOfTheSpaceship1 = "Union";
    String nameOfTheSpaceship2 = "Apollo";

    public void spaceship1() {
        Task5_Spaceship ss1  = new Task5_Spaceship();
        System.out.println("The name of the first spaceship is:");
        System.out.println(ss1.nameOfTheSpaceship1);
    }
    public void spaceship2(){
        Task5_Spaceship ss2 = new Task5_Spaceship();
        System.out.println("The name of the second spaceship is ");
        System.out.println(ss2.nameOfTheSpaceship2);
    }

    public static void main(String[] args) {
        Task5_Spaceship nameView = new Task5_Spaceship();
        nameView.spaceship1();
        nameView.spaceship2();
    }
}
