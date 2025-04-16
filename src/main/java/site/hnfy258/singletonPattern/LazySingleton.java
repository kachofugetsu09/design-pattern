package site.hnfy258.singletonPattern;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {

    }

    static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
            System.out.println("LazySingleton is created");

        }
        System.out.println("LazySingleton is called");
        return instance;
    }
}
