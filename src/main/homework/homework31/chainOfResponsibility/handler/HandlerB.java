package homework.homework31.chainOfResponsibility.handler;

public class HandlerB extends Handler{
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handler B processed request B");
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
