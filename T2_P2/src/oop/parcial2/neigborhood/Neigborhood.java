package oop.parcial2.neigborhood;
import java.util.List;

public class Neigborhood {
    private  List<Street> streets;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    Neigborhood(List<Street> streets, int gardens, boolean basketballCourt, boolean footballCourt, boolean swimmingPool){
        this.streets = streets;
        this.gardens = gardens;
        this.basketballCourt = basketballCourt;
        this.footballCourt = footballCourt;
        this.swimmingPool = swimmingPool;
    }

    public List getStreets(){
        return streets;
    }
    public int getGardens(){
        return gardens;
    }
    public boolean getBasketballCourt(){
        return basketballCourt;
    }
    public boolean getFootballCort(){
        return footballCourt;
    }
    public boolean getSwimmingPool(){
        return swimmingPool;
    }

    public static NeigborhoodBuilder builder(){
        return new NeigborhoodBuilder();
    }
}
