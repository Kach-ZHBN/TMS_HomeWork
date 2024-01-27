package homework.homework31.observer;

import homework.homework31.observer.observer.Observer;
import homework.homework31.observer.observer.ObserverA;
import homework.homework31.observer.observer.ObserverB;
import homework.homework31.observer.observer.ObserverC;
import homework.homework31.observer.subject.SubjectForSubscription;

public class ObserverTest {
    public static void main(String[] args) {
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        Observer observerC = new ObserverC();
        SubjectForSubscription subject = new SubjectForSubscription();

        subject.registerObserver(observerA);
        subject.registerObserver(observerB);
        subject.setMessage("Message 1: register A, B");
        System.out.println();

        subject.registerObserver(observerC);
        subject.setMessage("Message 2: register C");
        System.out.println();

        subject.removeObserver(observerA);
        subject.removeObserver(observerC);
        subject.setMessage("Message 3: remove A, C");
    }
}
