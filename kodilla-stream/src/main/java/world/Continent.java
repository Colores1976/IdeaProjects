package world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    static final List<Country> asia = new ArrayList<>();
    public void setAsia(Country country){
        asia.add(country);
    }
    public List<Country> getAsia(){
        return new ArrayList<>(asia);
    }

    static final List<Country> africa = new ArrayList<>();
    public void setAfrica(Country country){
        africa.add(country);
    }
    public List<Country>getAfrica(){
        return new ArrayList<>(africa);
    }

    static final List<Country> america = new ArrayList<>();
    public void setAmerica(Country country){
        america.add(country);
    }
    public List<Country>getAmerica(){
        return new ArrayList<>(america);
    }

    static final List<Country> europa = new ArrayList<>();
    public void setEuropa(Country country){
        europa.add(country);
    }
    public List<Country> getEuropa(){
        return new ArrayList<>(europa);
    }
}
