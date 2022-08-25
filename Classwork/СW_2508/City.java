package СW_2508;

import java.util.Scanner;

public class City {
    private String nameOfCity;
    private String nameOfRegion;
    private String nameOfCountry;
    private String population;
    private String postIndex;
    private String phoneCode;
    private Scanner scanner = new Scanner(System.in);

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        System.out.println("Введите имя: ");
        this.nameOfCity = scanner.nextLine();
    }

    public String getBirthDate() {
        return nameOfRegion;
    }

    public void setBirthDate(String birthDate) {
        System.out.println("Введите дату рождения: ");
        this.nameOfRegion = scanner.nextLine();
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        System.out.println("Введите телефон: ");
        this.nameOfCountry = scanner.nextLine();
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        System.out.println("Введите город: ");
        this.population = scanner.nextLine();
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        System.out.println("Введите страну: ");
        this.postIndex = scanner.nextLine();
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        System.out.println("Введите адрес: ");
        this.phoneCode = scanner.nextLine();
    }
}


