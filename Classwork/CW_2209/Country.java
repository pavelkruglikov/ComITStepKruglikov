package CW_2209;

import java.util.Scanner;

public class Country {
    public City city;
    public String nameOfCountry;
    public String nameOfContinent;

    public Country(City city, String nameOfCountry, String nameOfContinent) {
        this.city = city;
        this.nameOfCountry = nameOfCountry;
        this.nameOfContinent = nameOfContinent;
    }

    @Override
    public String toString() {
        return "Country" +
                "city=" + city +
                ", nameOfCountry='" + nameOfCountry + '\'' +
                ", nameOfContinent='" + nameOfContinent + '\'' +
                '}';
    }
}



