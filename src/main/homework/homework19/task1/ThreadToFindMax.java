package homework.homework19.task1;

import java.util.Arrays;

public class ThreadToFindMax extends Thread {
    private final double[] array;
    private double maxValue;

    public ThreadToFindMax(double[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        maxValue = Arrays.stream(array).max().getAsDouble();
    }

    public double getMaxValue() {
        return maxValue;
    }
}
