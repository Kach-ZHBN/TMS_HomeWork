package homework.homework9.builder;

/*
Провод. Параметры провода - длина и количество жил.
 */
public class Wire {
    private double length;
    private int coreNumber;

    public Wire(double length, int coreNumber) {
        this.length = length;
        this.coreNumber = coreNumber;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getCoreNumber() {
        return coreNumber;
    }

    public void setCoreNumber(int coreNumber) {
        this.coreNumber = coreNumber;
    }

    @Override
    public String toString() {
        return "length=" + length +
                ", coreNumber=" + coreNumber;
    }
}
