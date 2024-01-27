package homework.homework31.chainOfResponsibility.handler;

public class HandlerC extends Handler{
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
            System.out.println("Handler C processed request " + request);
    }
}
