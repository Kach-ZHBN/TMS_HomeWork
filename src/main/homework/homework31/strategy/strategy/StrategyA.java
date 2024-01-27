package homework.homework31.strategy.strategy;

import homework.homework31.strategy.Strategy;

public class StrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Print from strategy A");
    }
}
