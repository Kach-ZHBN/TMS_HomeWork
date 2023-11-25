package homework.homework19.difficultTask;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {
    private final Queue<Product> stock = new LinkedList<>();

    public Queue<Product> getStock() {
        return stock;
    }

    public boolean stockIsEmpty() {
        return stock.isEmpty();
    }

    public boolean stockIsFull() {
        return stock.size() == 3;
    }
}
