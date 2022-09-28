package oop.parcial2.neigborhood;
import java.util.List;

public class NeigborhoodBuilder {
    List<Street> streets;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    public NeigborhoodBuilder streets(List<Street> streets){
        this.streets = streets;
        return this;
    }
    public NeigborhoodBuilder gardens(int gardens){
        this.gardens = gardens;
        return this;
    }
    public NeigborhoodBuilder basketballCourt(boolean basketballCourt){
        this.basketballCourt = basketballCourt;
        return this;
    }
    public NeigborhoodBuilder footballCourt(boolean footballCourt) {
        this.footballCourt = footballCourt;
        return this;
    }
    public NeigborhoodBuilder swimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    public Neigborhood build(){
        return new Neigborhood(streets,gardens,basketballCourt,footballCourt,swimmingPool);
    }
}