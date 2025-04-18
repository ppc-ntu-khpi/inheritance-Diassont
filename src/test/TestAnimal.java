package test;

import domain.Hamster;

public class TestAnimal {

    public static void main(String[] args) {
        Hamster hamster = new Hamster("Homma");
        System.out.println(hamster);
        hamster.eat();
        hamster.speak();
        hamster.runInWheel();
        hamster.storeFood();
    }
}
