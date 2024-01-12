package homework.homework19.difficultTask;

public class Product {
    private static int itemNumber = 1;
    private final int serialNumber;

    public Product() {
        this.serialNumber = itemNumber++;
    }

    @Override
    public String toString() {
        return "Product " + serialNumber;
    }
}
