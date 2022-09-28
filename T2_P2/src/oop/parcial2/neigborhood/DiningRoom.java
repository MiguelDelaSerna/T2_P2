package oop.parcial2.neigborhood;
public class DiningRoom extends Room {
    private int windows;
    private int chairsCapacity;
    public boolean tv;

    DiningRoom(int width, int height, String color, int windows, int chairsCapacity, boolean tv){
        super(width, height, color);
        this.windows = windows;
        this.chairsCapacity = chairsCapacity;
        this.tv = tv;
    }

    public int getWindows(){
        return windows;
    }
    public int getChairsCapacity(){
        return chairsCapacity;
    }
    public boolean getTv(){
        return tv;
    }

        public static DiningRoomBuilder builder(){
        return new DiningRoomBuilder();
    }

}
