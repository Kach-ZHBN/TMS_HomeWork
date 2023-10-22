package homework.homework9.task2;

public class Circle extends Figure{
    private final double RADIUS;

    public Circle(double radius) {
        this.RADIUS = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * RADIUS * RADIUS;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * RADIUS;
    }
}
