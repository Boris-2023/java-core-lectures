package ru.gb.jcore;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", "Белый", 2021);
        Cat cat2 = new Cat("Murzik", "Black", 2017);
        Dog dog1 = new Dog("Tuzik", "Black", 2019);


        System.out.println("Кот № 1: имя = " + cat1.getName() +
                "\tцвет: " + cat1.getColor() +
                "\tвозраст: " + cat1.getAge());

        cat1.voice();
        cat1.jump();

        System.out.println("Пёс № 1: имя = " + dog1.getName() +
                "\tцвет: " + dog1.getColor() +
                "\tвозраст: " + dog1.getAge());

        dog1.voice();
        dog1.jump();

        System.out.println(
                "Cat1: " + cat1.getName() + " #" + cat1.uid + "\n" +
                "Cat2: " + cat2.getName() + " #" + cat2.uid + "\n" +
                "Dog1: " + dog1.getName() + " #" + dog1.uid + "\n");

    }
}