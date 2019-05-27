package IIworld;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Country {
    private final String name;
    private final BigDecimal population;
    private final String location;
    private final static Set<Country> countries = new HashSet<>();

    public Country(String name, BigDecimal population, String location) {
        this.name = name;
        this.population = population;
        this.location = location;
    }

    public void addCountry(Country country){
        countries.add(country);
    }
    public static Set<Country> countries(){
        return new HashSet<>(countries);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", location='" + location + '\'' +
                '}';
    }
}
