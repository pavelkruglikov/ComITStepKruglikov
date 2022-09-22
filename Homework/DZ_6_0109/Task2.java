package DZ_6_0109;

public class Task2 {
    public static void main(String[] args) {
        Task2 obj = new Task2();
        PriceTag person = new PriceTag("Milk", 100);
        System.out.println(person.product);
        person.showName(person.product);

        System.out.println(PriceTag.price);
        PriceTag.showAge(PriceTag.price);

    }

}

class PriceTag {
    public String product;
    public static int price;

    PriceTag(String name, int age)
    {
        this.product = name;
        PriceTag.price = age;
    }

    public void showName (String name){
        System.out.println("Product is " + name);
    }

    public static void showAge (int age){
        System.out.println("Price is " + age);
    }


}
