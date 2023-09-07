package doky.demo.chapter1;

public class ConcreteObserverB implements Observer<String> {

    @Override
    public void observe(String event) {
        System.out.println("Observe B : " + event);
    }
}
