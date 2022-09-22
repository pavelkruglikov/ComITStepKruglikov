package CW_2209;

public class City {
    private String nameOfCity;
    private String nameOfCountry;
    private int countOfPeople;

    public City(String nameOfCity, String nameOfCountry, int countOfPeople) {
        this.nameOfCity = nameOfCity;
        this.nameOfCountry = nameOfCountry;
        this.countOfPeople = countOfPeople;
    }

    @Override
    public String toString() {
        return "City{" +
                "nameOfCity='" + nameOfCity + '\'' +
                ", nameOfCountry='" + nameOfCountry + '\'' +
                ", countOfPeople=" + countOfPeople +
                '}';
    }
}
