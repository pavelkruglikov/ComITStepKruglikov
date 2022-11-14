package DZ_10_1011.Pr2;

/* Создайте класс с внутренним классом.
В отдельный класс, сделайте экземпляр внутреннего учебный класс. */

public class MainClass {
    public static void main(String[] args) {
        ClassWithInnerClass.Inner start = new ClassWithInnerClass.Inner();
        start.sayHello();
    }


}
