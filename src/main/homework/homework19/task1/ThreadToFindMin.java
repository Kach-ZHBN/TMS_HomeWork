package homework.homework19.task1;

import java.util.Arrays;

public class ThreadToFindMin extends Thread {
    private final double[] array;
    private double minValue;

    public ThreadToFindMin(double[] array) {
        this.array = array;
    }

    @Override
    public void run(){
        minValue = Arrays.stream(array).min().getAsDouble();
    }

    public double getMinValue() {
        return minValue;
    }
}
