package ru.gb.jcore;

public abstract class Animal {
    protected static final int CURRENT_YEAR = 2024;
    protected static int id = 0;
    protected String name;
    protected String color;
    protected int birthYear;

    // ------> Constructors
    public Animal(String name, String color, int birthYear) {
        this(name, color);
        this.birthYear = birthYear;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // copying constructor
    public Animal(Animal animal) {
        this(animal.name, animal.color, animal.birthYear);
    }

    public Animal(String name) {
        this.name = name;
        color = "unknown";
        birthYear = 1;
    }

    // empty constructor
    public Animal() {
    }

    void jump() {
        if (this.birthYear < 5)
            System.out.println(name + " jumps");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    abstract void voice();

    void move(){
        System.out.println(name + " walks on paws");
    }

}
