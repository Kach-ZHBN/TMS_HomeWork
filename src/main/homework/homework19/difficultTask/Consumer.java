package homework.homework19.difficultTask;

public class Consumer {
    private final Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    public void buyProduct() throws InterruptedException {
        Thread.sleep(3000);
        synchronized (shop) {
            while (shop.stockIsEmpty()) {
                shop.wait();
            }
            System.out.println("Consumer buy " + shop.getStock().remove());
            shop.notify();
        }
    }
}

