package domain;

public class Animal {

    protected String name;
    protected int weight;

    public Animal() {
        name = "generic animal";
        weight = 1;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void speak() {
        System.out.println("Animal is makinSg a sound...");
    }

    @Override
    public String toString() {
        return "My animal:\nName:\t" + name + "\nWeight:\t" + weight + " kg";
    }
}
