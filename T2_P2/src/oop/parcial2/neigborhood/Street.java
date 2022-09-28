package oop.parcial2.neigborhood;
import java.util.TreeMap;

public class Street {
    private String name;
    private TreeMap<Integer, House> houses;

    public Street(String name, TreeMap<Integer, House> houses){
        this.name = name;
        this.houses = houses;
    }

    public String getName(){
        return name;
    }
    public TreeMap<Integer, House> getHouses(){
        return houses;
    }
    public House getHouse(int number){
        return null;
    }

    public static StreetBuilder builder(){
        return new StreetBuilder();
    }
}

