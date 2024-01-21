package homework.homework31.decorator.topping;

import homework.homework31.decorator.pizza.Pizza;

public class PepperTopping extends PizzaTopping {
    private Pizza pizza;

    public PepperTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getPizzaName() {
        return pizza.getPizzaName() + "+ Pepper topping";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.3;
    }
}
