package homework.homework31.decorator.topping;

import homework.homework31.decorator.pizza.Pizza;

public class CheeseTopping extends PizzaTopping {
    private Pizza pizza;

    public CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getPizzaName() {
        return pizza.getPizzaName() + " + Cheese topping";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.7;
    }
}
