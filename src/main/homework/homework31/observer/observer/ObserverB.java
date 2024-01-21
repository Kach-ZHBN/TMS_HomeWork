package homework.homework31.observer.observer;

public class ObserverB implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Observer B received a message: " + message);
    }
}
