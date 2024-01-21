package homework.homework31.decorator.topping;

import homework.homework31.decorator.pizza.Pizza;

public class BaconTopping extends PizzaTopping {
    private Pizza pizza;

    public BaconTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getPizzaName() {
        return pizza.getPizzaName() + " + Bacon topping";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.9;
    }
}
