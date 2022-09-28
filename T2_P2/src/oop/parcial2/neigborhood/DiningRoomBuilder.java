package oop.parcial2.neigborhood;

public class DiningRoomBuilder {
    private int width;
    private int height;
    private String color;
    private int windows;
    private int chairsCapacity;
    public boolean tv;

    public DiningRoomBuilder width(int width){
        this.width = width;
        return this;
    }

    public DiningRoomBuilder height(int height){
        this.height = height;
        return this;
    }
    public DiningRoomBuilder color(String color){
        this.color = color;
        return this;
    }
    public DiningRoomBuilder windows(int windows){
        this.windows = windows;
        return this;
    }
    public DiningRoomBuilder chairsCapacity(int chairsCapacity){
        this.chairsCapacity = chairsCapacity;
        return this;
    }
    public DiningRoomBuilder tv(boolean tv){
        this.tv = tv;
        return this;
    }


  public DiningRoom build(){
        return new DiningRoom(width, height, color,windows, chairsCapacity,tv);
    }
}
