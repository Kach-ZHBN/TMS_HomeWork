package homework.homework32.strategy.strategy;

import homework.homework32.strategy.Strategy;

public class StrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Print from strategy B");
    }
}
