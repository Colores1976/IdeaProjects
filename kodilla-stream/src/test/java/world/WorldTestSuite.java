package world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testPeopleQuantity() {

        //Given

        Country chiny = new Country("Chiny", new BigDecimal("1379302711"));
        Country indie = new Country("Indie", new BigDecimal("1281935911"));
        Country ziemiomorze = new Country("Ziemiomorze", new BigDecimal("1325362573"));
        Country rosja = new Country("Rosja", new BigDecimal("143601000"));
        Country ue = new Country("UE", new BigDecimal("516000000"));

        Set<Country> asiaCountries = new HashSet<>();
        asiaCountries.add(chiny);
        asiaCountries.add(indie);
        Set<Country> europaCountries = new HashSet<>();
        europaCountries.add(rosja);
        europaCountries.add(ue);
        Set<Country> africaCountries = new HashSet<>();
        africaCountries.add(ziemiomorze);

        Continent asia = new Continent("Asia", asiaCountries);
        Continent europa = new Continent("Europa", europaCountries);
        Continent africa = new Continent("Africa", africaCountries);

        List<Continent> continents = new ArrayList<>();
        continents.add(asia);
        continents.add(europa);
        continents.add(africa);
        World world = new World(continents);

        // When
        BigDecimal result =  world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("4646202195");
        //Then
        Assert.assertEquals(expectedResult, result);
    }
}
