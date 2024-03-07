package ru.gb.jcore;

public class Snake extends Animal{

    public Snake(String name, String color, int birthDate) {
        super(name, color, birthDate);
    }

    @Override
    void voice() {
        System.out.println(name + " hisses");
    }

    @Override
    void move(){
        System.out.println(name + " crawls");
    }
}
