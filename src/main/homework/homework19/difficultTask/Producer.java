package homework.homework19.difficultTask;

public class Producer {
    private final Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    public void supplyProductToShop() throws InterruptedException {
        synchronized (shop) {
            Thread.sleep(2000);
            while (shop.stockIsFull()) {
                shop.wait();
            }
            Product product = new Product();
            shop.getStock().add(product);
            System.out.println("Producer supply " + product);
            shop.notify();

        }
    }
}
