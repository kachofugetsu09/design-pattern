package site.hnfy258.factoryPattern;

public class AnimalFactory {
    public static Animal createAnimal(String type){
        if(type.equals("dog")){
            return new Dog();
        }
        if(type.equals("cat")){
            return new Cat();
        }
        return null;
    }
}
