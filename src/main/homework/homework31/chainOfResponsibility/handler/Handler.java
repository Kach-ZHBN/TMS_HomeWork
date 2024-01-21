package homework.homework31.chainOfResponsibility.handler;

public abstract class Handler {
    public abstract void setNextHandler(Handler nextHandler);
    public abstract void handleRequest(String request);
}
