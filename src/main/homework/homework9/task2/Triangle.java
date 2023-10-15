package homework.homework9.task2;

public class Triangle extends Figure {
    private final double SIDE_A;
    private final double SIDE_B;
    private final double SIDE_C;

    public Triangle(double sideA, double sideB, double sideC) {
        this.SIDE_A = sideA;
        this.SIDE_B = sideB;
        this.SIDE_C = sideC;
    }

    @Override
    public double getArea() {
        double semiPerimeter = (SIDE_A + SIDE_B + SIDE_C) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - SIDE_A)
                * (semiPerimeter - SIDE_B) * (semiPerimeter - SIDE_C));
    }

    @Override
    public double getPerimeter() {
        return SIDE_A + SIDE_B + SIDE_C;
    }
}
