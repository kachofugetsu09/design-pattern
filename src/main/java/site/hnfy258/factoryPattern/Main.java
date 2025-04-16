package site.hnfy258.factoryPattern;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal("cat");
        animal.say();
        animal = AnimalFactory.createAnimal("dog");
        animal.say();
    }
}
