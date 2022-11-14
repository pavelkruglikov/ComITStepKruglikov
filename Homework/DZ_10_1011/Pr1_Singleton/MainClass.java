package DZ_10_1011.Pr1_Singleton;

public class MainClass {

    public static void main(String[] args) {
        connectionManager.getInstance().connectionManagerWihHashCode();
        connectionManager.getInstance().connectionManagerWihHashCode();
    }
}
