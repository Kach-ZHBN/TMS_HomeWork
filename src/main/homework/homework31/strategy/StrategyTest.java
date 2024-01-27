package homework.homework31.strategy;

import homework.homework31.strategy.strategy.StrategyA;
import homework.homework31.strategy.strategy.StrategyB;
import homework.homework31.strategy.strategy.StrategyC;

public class StrategyTest {
    public static void main(String[] args) {
        StrategyUser strategyUser = new StrategyUser();

        strategyUser.setStrategy(new StrategyA());
        strategyUser.useStrategy();

        strategyUser.setStrategy(new StrategyB());
        strategyUser.useStrategy();

        strategyUser.setStrategy(new StrategyC());
        strategyUser.useStrategy();

        strategyUser.setStrategy(new StrategyA());
        strategyUser.useStrategy();
    }
}
