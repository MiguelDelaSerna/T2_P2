package oop.parcial2.neigborhood;

public class LivingRoom extends Room{
    private int windows;
    private boolean tv;
    private boolean homeTeather;

    LivingRoom(int windows, boolean tv, boolean homeTeather, int width, int height, String color){
        super(width, height, color);
        this.windows = windows;
        this.tv = tv;
        this.homeTeather = homeTeather;
    }

    public int getWindows(){
        return windows;
    }
    public boolean getTv(){
        return tv;
    }
    public boolean getHomeTeather(){
        return homeTeather;
    }

    public static void builder(){
        new LivingRoomBuilder();
    }
}
