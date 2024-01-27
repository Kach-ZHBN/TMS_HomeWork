package homework.homework31.observer.observer;

public class ObserverA implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Observer A received a message: " + message);
    }
}
