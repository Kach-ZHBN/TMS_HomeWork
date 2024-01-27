package homework.homework31.chainOfResponsibility;

import homework.homework31.chainOfResponsibility.handler.Handler;
import homework.homework31.chainOfResponsibility.handler.HandlerA;
import homework.homework31.chainOfResponsibility.handler.HandlerB;
import homework.homework31.chainOfResponsibility.handler.HandlerC;

public class chainOfResponsibilityTest {
    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.handleRequest("A");
        handlerA.handleRequest("B");
        handlerA.handleRequest("qwerty");
    }
}
