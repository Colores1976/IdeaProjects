/*package IIworld;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public final class Continent {
    private final String name;
    private final Set<Country> continent;


    public Continent(String name, Set<Country> continent) {
        this.name = name;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public Set<Country> grupCountries(){
        Country.countries().stream()
                .map(country -> country.getLocation())
                .filter(c -> c.equals(Continent.getName))
                .collect(Collectors.toSet());
        return final HashSet<Continent> name;
    }
}
*/

