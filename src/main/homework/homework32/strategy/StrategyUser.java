package homework.homework32.strategy;

public class StrategyUser {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void useStrategy(){
        strategy.execute();
    }
}
