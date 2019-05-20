package world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World implements QuantityOfPeople {


    private static final List<Country> world = new ArrayList<>();

   public List<Country> world(){
       world.addAll(Continent.asia);
       world.addAll(Continent.africa);
       world.addAll(Continent.america);
       world.addAll(Continent.europa);
       return new ArrayList<>(world);
   }

    @Override
    public BigDecimal getPeopleQuantity() {
        return BigDecimal.ZERO;
        world.stream()
                .flatMap(country -> country.getCountries())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal::add);

    }
}
