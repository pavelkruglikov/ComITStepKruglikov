package DZ_10_1011.Pr3_OuterAndInner;

/*1) Напишите класс с именем Outer, содержащий
        внутренний класс с именем Inner. Добавьте метод во внешний
        который возвращает объект типа Inner. В
        main(), создать и инициализировать ссылку на
        внутренний.
2) Изменить Задание 1, чтобы у Outer был private String
        (инициализируется конструктором),
        и у Inner есть toString(), который отображает это
        поле. Создайте объект типа Inner и
        показать его.*/

public class Outer {

    private String stringFiled;

    public Outer(String stringFiled) {
        this.stringFiled = stringFiled;
    }

    public static void getInner() {
        Inner createObject = new Inner();
    }

    static class Inner {

        public void sayHello() {
            System.out.println("Hello from inner class");
        }

    }
}
