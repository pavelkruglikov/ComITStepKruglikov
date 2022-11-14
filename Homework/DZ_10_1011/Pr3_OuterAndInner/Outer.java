package DZ_10_1011.Pr3_OuterAndInner;

public class Outer {

    public static void getInner(){
        Inner createObject = new Inner();
    }
    static class Inner {
        public void sayHello(){
            System.out.println("Hello from inner class");
        }

    }
}
