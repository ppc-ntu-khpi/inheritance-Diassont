package domain;

public class Hamster extends Animal {

    private String breed;

    public Hamster(String name, int weight, String breed) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }

    public Hamster() {
        this("Homma", 1, "Syrian");
    }

    public Hamster(String name) {
        this(name, 1, "Dzungarian");
    }

    public void runInWheel() {
        System.out.println("Hamster is running in the wheel...");
    }

    public void storeFood() {
        System.out.println("Hamster is storing food in its cheeks...");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eats seeds and grains...");
    }

    @Override
    public void speak() {
        System.out.println("Squeak! Squeak!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nBreed:\t" + breed + "\n\nThis is a Hamster!";
    }
}
