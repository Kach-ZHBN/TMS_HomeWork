package homework.homework31.decorator;

import homework.homework31.decorator.pizza.Pepperoni;
import homework.homework31.decorator.pizza.Pizza;
import homework.homework31.decorator.topping.BaconTopping;
import homework.homework31.decorator.topping.OlivesTopping;
import homework.homework31.decorator.topping.PepperTopping;

public class DecoratorTest {
    public static void main(String[] args) {
        Pizza pizza = new Pepperoni();
        System.out.println(pizza.getPizzaName() + " | " + pizza.cost());

        pizza = new BaconTopping(pizza);
        System.out.println(pizza.getPizzaName() + " | " + pizza.cost());

        pizza = new OlivesTopping(pizza);
        System.out.println(pizza.getPizzaName() + " | " + pizza.cost());

        pizza = new PepperTopping(pizza);
        System.out.println(pizza.getPizzaName() + " | " + pizza.cost());
    }

}
