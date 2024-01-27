package homework.homework31.decorator.pizza;

public class Pepperoni extends Pizza {
    @Override
    public String getPizzaName() {
        return "Pepperoni";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
