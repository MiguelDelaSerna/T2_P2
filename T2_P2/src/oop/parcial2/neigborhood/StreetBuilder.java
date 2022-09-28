package oop.parcial2.neigborhood;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class StreetBuilder{
    private String name;
    private Map<Integer, House> houses;

    public StreetBuilder(){
        houses = new LinkedHashMap<>();
    }

    public StreetBuilder name(String name){
        this.name = name;
        return this;
    }
    public StreetBuilder houses(TreeMap<Integer, House> houses){
        this.houses = houses;
        return this;
    }
    public StreetBuilder house(int number, House house){
        houses.put(number, house);
        return this;
    }

    public Street build(){
       return new Street(name, (TreeMap<Integer, House>) houses);
    }
}