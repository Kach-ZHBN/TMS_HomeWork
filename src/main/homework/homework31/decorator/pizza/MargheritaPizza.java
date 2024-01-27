package homework.homework31.decorator.pizza;

public class MargheritaPizza extends Pizza {
    @Override
    public String getPizzaName() {
        return "Margherita Pizza";
    }

    @Override
    public double cost() {
        return 3;
    }
}
