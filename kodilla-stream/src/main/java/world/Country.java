package world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Country implements QuantityOfPeople{
private final String name;
private final String continent;
private final BigDecimal population;

 private static final Set<Country> countries = new HashSet<>();

    public Country(final String name, final String continent, final BigDecimal population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
    }
    public void addContinent(Country country){
        countries.add(country);
    }

    public static final Set<Country> getCountries(){
        return new HashSet<>(countries);
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                '}';
    }
}
