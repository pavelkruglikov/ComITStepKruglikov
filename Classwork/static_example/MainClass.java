package static_example;

public class MainClass {
    public static void main(String[] args) {
        ClassWithStaticInt obj1 = new ClassWithStaticInt();
        obj1.x++;
        ClassWithStaticInt obj2 = new ClassWithStaticInt();
        obj2.x++;
        ClassWithStaticInt obj3 = new ClassWithStaticInt();
        obj3.x++;
        ClassWithStaticInt obj4 = new ClassWithStaticInt();
        obj4.x++;
        System.out.println(ClassWithStaticInt.x);

    }
}
