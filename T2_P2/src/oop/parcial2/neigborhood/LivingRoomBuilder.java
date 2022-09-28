package oop.parcial2.neigborhood;

public class LivingRoomBuilder {
    private int width;
    private int height;
    private String color;
    private int windows;
    private boolean tv;
    private boolean homeTeather;

    public LivingRoomBuilder width(int width){
        this.width = width;
        return this;
    }

    public LivingRoomBuilder height(int height){
        this.height = height;
        return this;
    }
    public LivingRoomBuilder color(String color) {
        this.color = color;
        return this;
    }
    public LivingRoomBuilder tv(int windows) {
        this.windows = windows;
        return this;
    }
    public LivingRoomBuilder tv(boolean tv) {
        this.tv = tv;
        return this;
    }

    public LivingRoomBuilder homeTeather(boolean homeTeather) {
        this.homeTeather = homeTeather;
        return this;
    }

    public LivingRoom Build(){
        return new LivingRoom(windows,tv, homeTeather,width, height, color);
    }
}
