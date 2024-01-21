package homework.homework31.observer.subject;

import homework.homework31.observer.observer.Observer;
import homework.homework31.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectForSubscription implements Subject {
    private List<Observer> observerList;
    private String message;

    public SubjectForSubscription() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }
}
