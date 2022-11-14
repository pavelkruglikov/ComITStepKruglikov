package DZ_10_1011.Pr2;

/* Создайте класс с внутренним классом.
В отдельный класс, сделайте экземпляр внутреннего учебный класс. */

public class ClassWithInnerClass {
    static class Inner{
        public void sayHello(){
            System.out.println("Hello from inner class");
        }
    }
}
