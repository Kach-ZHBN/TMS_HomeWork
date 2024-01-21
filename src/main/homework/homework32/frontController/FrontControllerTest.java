package homework.homework32.frontController;

public class FrontControllerTest {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("ITEM");
        frontController.dispatchRequest("student");
    }
}
