package СW_2508;

import java.util.Scanner;

public class Person {
    private String name;
    private String birthDate;
    private String contactPhone;
    private String city;
    private String country;
    private String address;
    private Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Введите имя: ");
        this.name = scanner.nextLine();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        System.out.println("Введите дату рождения: ");
        this.birthDate = scanner.nextLine();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        System.out.println("Введите телефон: ");
        this.contactPhone = scanner.nextLine();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("Введите город: ");
        this.city = scanner.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        System.out.println("Введите страну: ");
        this.country = scanner.nextLine();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Введите адрес: ");
        this.address = scanner.nextLine();
    }
}


