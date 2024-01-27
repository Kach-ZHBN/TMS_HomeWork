package homework.homework31.decorator.pizza;

public class CheesePizza extends Pizza {
    @Override
    public String getPizzaName() {
        return "Cheese Pizza";
    }

    @Override
    public double cost() {
        return 2.30;
    }
}
