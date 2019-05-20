package world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static world.Continent.asia;

public class WorldTestSuite {
    @Test
    public void testPeopleQuantity(){
        //Given
      World world = new World();
      Continent continent = new Continent();
      continent.setAfrica(new Country("Ziemiomorze", "Africa",new BigDecimal(1325362573)));
      continent.setAsia(new Country("Chiny","Asia", new BigDecimal(1379302771)));
      continent.setAsia(new Country("Indie", "Asia", new BigDecimal(1281935911)));
      continent.setAmerica(new Country("USA", "America", new BigDecimal(326625791)));
      continent.setAmerica(new Country("South America", "America", new BigDecimal(659195890)));
      continent.setEuropa(new Country("UE", "Europe", new BigDecimal(516000000)));
      continent.setEuropa(new Country("Rosja", "Europe", new BigDecimal(143601000)));
        //When
    BigDecimal result = new BigDecimal("5632023936");
        //Then
        Assert.assertEquals(result, world.getPeopleQuantity());
    }
}
