package homework.homework31.chainOfResponsibility.handler;

public class HandlerA extends Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Handler A processed request A");
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
