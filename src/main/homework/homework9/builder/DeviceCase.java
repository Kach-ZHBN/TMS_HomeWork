package homework.homework9.builder;

/*
Корпус. Параметры корпуса - его габариты.
 */
public class DeviceCase {
    private double length;
    private double weight;
    private double height;

    public DeviceCase(double length, double weight, double height) {
        this.length = length;
        this.weight = weight;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return length + "x" + weight + "x" + height;
    }
}
