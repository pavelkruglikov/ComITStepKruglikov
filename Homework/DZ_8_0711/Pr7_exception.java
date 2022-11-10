package DZ_8_0711;

public class Pr7_exception {
    public void f(){
        try {
            g();
        } catch (RuntimeException e) {
            throw new IllegalStateException("Exception from F method");
        }
    }
    public void g(){
        throw new RuntimeException("Exception from G method");
    }

    public static void main(String[] args) {
        Pr7_exception start = new Pr7_exception();
        start.f();

    }
}
