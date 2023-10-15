package homework.homework9.task2;

public class Rectangle extends Figure {
    private final double SIDE_A;
    private final double SIDE_B;

    public Rectangle(double sideA, double sideB) {
        this.SIDE_A = sideA;
        this.SIDE_B = sideB;
    }

    @Override
    public double getArea() {
        return SIDE_A * SIDE_B;
    }

    @Override
    public double getPerimeter() {
        return 2 * (SIDE_A + SIDE_B);
    }
}
