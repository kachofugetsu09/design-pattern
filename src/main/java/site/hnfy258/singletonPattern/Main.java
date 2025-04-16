package site.hnfy258.singletonPattern;

public class Main {
    public static void main(String[] args) {
        LazySingleton lazySingleton0= LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
    }
}
