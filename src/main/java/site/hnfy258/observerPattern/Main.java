package site.hnfy258.observerPattern;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("observer1");
        ConcreteObserver observer2 = new ConcreteObserver("observer2");
        subject.add(observer1);
        subject.add(observer2);

        subject.notifyObservers("奶龙666");
    }
}
