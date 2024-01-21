package homework.homework31.decorator.topping;

import homework.homework31.decorator.pizza.Pizza;

public class OlivesTopping extends PizzaTopping {
    private Pizza pizza;

    public OlivesTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getPizzaName() {
        return pizza.getPizzaName() + " + Olives topping";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.55;
    }
}
