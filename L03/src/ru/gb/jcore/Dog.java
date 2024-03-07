package ru.gb.jcore;

public class Dog extends Animal {
    static int pawsCount = 4;
    public int uid;

    // -------> constructors

    public Dog(String name, String color, int birthDate) {

        super(name, color, birthDate);
        uid = ++super.id;

    }

    @Override
    void voice() {
        System.out.println(name + " barks");
    }

}
