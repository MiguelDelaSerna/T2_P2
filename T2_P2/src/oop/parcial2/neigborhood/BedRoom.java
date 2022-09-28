package oop.parcial2.neigborhood;

public class BedRoom extends Room {
    BedSize bedSize;
    private boolean tv;

    BedRoom(int width, int height, String color, BedSize bedSize, boolean tv){
        super(width, height, color);
        this.bedSize = bedSize;
        this.tv=tv;
    }

    public boolean getTv() {
        return tv;
    }
    public void bedSize(BedSize queen) {
        this.bedSize = queen;
    }

    public static BedRoomBuilder builder(){
        return new BedRoomBuilder();
    }

}
