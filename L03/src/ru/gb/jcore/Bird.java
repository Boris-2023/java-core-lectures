package ru.gb.jcore;

public class Bird extends Animal{
    static int pawsCount = 2;
    int flyHeight;

    public Bird(String name, String color, int birthYear, int flyHeight){
        super(name, color, birthYear);
        this.flyHeight = flyHeight;
    }

    @Override
    void voice() {
        System.out.println(name + " tweets");
    }
}
