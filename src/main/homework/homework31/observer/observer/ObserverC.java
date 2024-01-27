package homework.homework31.observer.observer;

public class ObserverC implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Observer C received a message: " + message);
    }
}
