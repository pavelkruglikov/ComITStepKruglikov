package DZ_8_0711;

public class Pr2_employee {

    public static void main(String[] args) {

        Person employee1 = new Person("Ivan", 30, "Vitebsk", "2020327", 1000);
        employee1.displayName();
        employee1.displayAge();
        employee1.displayPhone();
        employee1.displayAddress();
        employee1.displaySalary();
    }
}

class Person {

    final protected String name;
    final protected int age;
    final protected String address;
    final protected String phone;
    final protected int salary;

    public Person(String name, int age, String address, String phone, int salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        if (age > 0 && age < 100) {
            System.out.println("Age: " + age);
        } else {
            throw new IllegalStateException("Incorrect age input");
        }

    }

    public void displayAddress() {
        System.out.println("Address: " + address);
    }

    public void displayPhone() {
        System.out.println("Phone: " + phone);

    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}
