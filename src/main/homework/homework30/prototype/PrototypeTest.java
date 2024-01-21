package homework.homework30.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Car originalCar = new Car("Sedan", "Electro", "Automatic transmission");
        Car copyCar = originalCar.copy();

        System.out.println(originalCar + "|" + originalCar.getType() + "|" + originalCar.getEngine() + "|" + originalCar.getTransmission());
        System.out.println(copyCar + "|" + copyCar.getType() + "|" + copyCar.getEngine() + "|" + copyCar.getTransmission());
    }
}
