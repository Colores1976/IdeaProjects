package world;


import java.util.Set;

public class Continent {
    private final String name;
    private final Set<Country> countries;

    public Continent(String name, Set<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }


    public Set<Country> getCountries() {
        return countries;
    }

}
