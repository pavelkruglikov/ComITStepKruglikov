package СW_2508;

import java.util.Scanner;

public class Country {
    private String nameOfCountry;
    private String nameOfContinent;
    private String populationOfCountry;
    private String phoneCode;
    private String capital;
    private String otherCityNames;
    private Scanner scanner = new Scanner(System.in);

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        System.out.println("Введите имя: ");
        this.nameOfCountry = scanner.nextLine();
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void setNameOfContinent(String nameOfContinent) {
        System.out.println("Введите дату рождения: ");
        this.nameOfContinent = scanner.nextLine();
    }

    public String getPopulationOfCountry() {
        return populationOfCountry;
    }

    public void setPopulationOfCountry(String populationOfCountry) {
        System.out.println("Введите телефон: ");
        this.populationOfCountry = scanner.nextLine();
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        System.out.println("Введите город: ");
        this.phoneCode = scanner.nextLine();
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        System.out.println("Введите страну: ");
        this.capital = scanner.nextLine();
    }

    public String getOtherCityNames() {
        return otherCityNames;
    }

    public void setOtherCityNames(String otherCityNames) {
        System.out.println("Введите адрес: ");
        this.otherCityNames = scanner.nextLine();
    }
}


