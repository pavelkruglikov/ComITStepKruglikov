package DZ_7_2410.Pr2_ConnectionExample;

public class MainClass {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            ConnectionManager.getConnection(i);
        }
        ConnectionManager.doSomething();    }
}