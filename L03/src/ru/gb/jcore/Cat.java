package ru.gb.jcore;

public class Cat extends Animal {
    static int pawsCount = 4;

    public int uid;

    public Cat(String name, String color, int birthYear) {
        super(name, color, birthYear);
        uid = ++super.id;
    }

    @Override
    void voice() {
        System.out.println(name + " meows");
    }

}
