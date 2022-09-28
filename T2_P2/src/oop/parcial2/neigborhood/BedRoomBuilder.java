package oop.parcial2.neigborhood;

public class BedRoomBuilder {
    private BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    public BedRoomBuilder bedSize(BedSize bedSize){
        this.bedSize = bedSize;
        return this;
    }
    public BedRoomBuilder width(int width){
        this.width = width;
        return this;
    }

    public BedRoomBuilder height(int height){
        this.height = height;
        return this;
    }
    public BedRoomBuilder color(String color) {
        this.color = color;
        return this;
    }
    public BedRoomBuilder tv(boolean tv) {
        this.tv = tv;
        return this;
    }

    public BedRoom build(){
        return new BedRoom(width,height,color,bedSize,tv);
    }
}