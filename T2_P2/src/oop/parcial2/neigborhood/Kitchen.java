package oop.parcial2.neigborhood;

public class Kitchen extends Room{
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;


    Kitchen(boolean stove, boolean sink, int windows, boolean refrigerator, boolean oven, int width, int height, String color){
        super(width, height, color);
        this.stove = stove;
        this.sink = sink;
        this.windows = windows;
        this.refrigerator = refrigerator;
        this.oven = oven;
    }

    public boolean getStove(){
        return stove;
    }
    public int getWindows(){
        return windows;
    }
    public boolean getRefrigerator(){
        return refrigerator;
    }
    public boolean getSink(){
        return sink;
    }
    public boolean getOven(){
        return oven;
    }

    public static KitchenBuilder builder(){
        return new KitchenBuilder();
    }
}
