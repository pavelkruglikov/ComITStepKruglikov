package DZ_8_0711.Pr5_enumCars;

import java.util.Arrays;

/*Предприятие выпускает автомобиль в разных модификациях кузова:
Купе (COUPE)  consumption – 9 l    price - 300
Кабриолет (CABRIOLET)   consumption – 10 l  price - 500
Седан (SEDAN)  consumption – 12 l  price - 600

1) Создать enum – ‘СarBody’
2) Определить конструктор с двумя параметрами: consumption и price
3) Методы доступа к характеристикам consumption и price
4) Создать класс Car c полем bodytype
5) Создать объект car1 и проинициализировать bodytype значением CABRIOLET
6) Вывести все значения enum c характеристиками (использовать метод values()) ВОПРОС КАК ПРАВИЛЬНО ЭТО РЕАЛИЗОВАТЬ
*/
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(CarBody.SEDAN);
        System.out.println("Car #1 is " + car1.bodytype + " with consumption "
                + car1.bodytype.getConsumption() + " and price " + car1.bodytype.getPrice());
        Car car2 = new Car(CarBody.CABRIOLET);
        System.out.println("Car #2 is " + car2.bodytype + " with consumption "
                + car2.bodytype.getConsumption() + " and price " + car2.bodytype.getPrice());
        Car car3 = new Car(CarBody.COUPE);
        System.out.println("Car #3 is " + car3.bodytype + " with consumption "
                + car3.bodytype.getConsumption() + " and price " + car3.bodytype.getPrice());

        CarBody[] carBodies = CarBody.values();
        for (CarBody s: carBodies
             ) {
            System.out.println(s);
        }

    }}
