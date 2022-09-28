package oop.parcial2.neigborhood;

public class YardBuilder {
    boolean grass;
    int width;
    int height;
    String color;

    public YardBuilder width(int width){
        this.width= width;
        return this;
    }
    public YardBuilder height(int height){
        this.height= height;
        return this;
    }
    public YardBuilder color(String color){
        this.color= color;
        return this;
    }
    public YardBuilder grass(boolean grass){
        this.grass= grass;
        return this;
    }

    public Yard Build(){
        return new Yard(width, height, color, grass);
    }
}
