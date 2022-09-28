package oop.parcial2.neigborhood;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private List<RestRoom> restRooms;
    private List<BedRoom>  bedRooms;

    public HouseBuilder kitchen(Kitchen kitchen){
        this.kitchen = kitchen;
        return this;
    }

    public HouseBuilder diningRoom(DiningRoom diningRoom){
        this.diningRoom = diningRoom;
        return this;
    }

    public HouseBuilder livingRooms(LivingRoom livingRoom){
        this.livingRoom = livingRoom;
        return this;
    }

    public HouseBuilder restRooms(List<RestRoom> restRooms){
        this.restRooms = restRooms;
        return this;
    }

    public HouseBuilder bedRooms(List<BedRoom> bedRooms){
        this.bedRooms = bedRooms;
        return this;
    }
    public HouseBuilder bedRoom(BedRoom bedRooms){
        if(this.bedRooms == null){
            this.bedRooms = new ArrayList<>();
        }
        this.bedRooms.add(bedRooms);
        return this;
    }

    public House build(){
        return new House(kitchen,diningRoom, livingRoom, restRooms,bedRooms);
    }
}
