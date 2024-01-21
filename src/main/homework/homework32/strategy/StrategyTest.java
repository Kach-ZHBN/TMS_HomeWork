package homework.homework32.strategy;

import homework.homework32.strategy.strategy.StrategyA;
import homework.homework32.strategy.strategy.StrategyB;
import homework.homework32.strategy.strategy.StrategyC;

//Стратегию добавил из ДЗ 31
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
