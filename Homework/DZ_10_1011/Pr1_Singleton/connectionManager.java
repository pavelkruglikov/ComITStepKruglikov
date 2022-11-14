package DZ_10_1011.Pr1_Singleton;

/*Сделайте так, чтобы экземпляр ConnectionManager создавался только один раз.
Используйте парадигму программирования Singleton.
Контрольный список:
- Определите частный статический атрибут в «едином класс "экземпляр".
- Определите общедоступную статическую функцию доступа в классе.
- Выполните «ленивую инициализацию» (создание при первом использовании) в функцию доступа.
- Определите все конструкторы как защищенные или закрытые.*/

public class connectionManager {

    private static connectionManager singleton;

    private connectionManager () {}

    public static connectionManager getInstance(){
        if (singleton == null) {
            singleton = new connectionManager();
        }
        return singleton;
    }

    public void connectionManagerWihHashCode() {
        System.out.println("Hashcode of connection manager " + hashCode());
    }
}
