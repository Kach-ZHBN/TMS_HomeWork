package homework.homework30.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Car sportCar = new Car.CarBuilder("Sport", "6.0 бензин", "Роботизированная КПП")
                .setSpoiler()
                .setAlarm()
                .setCarMats()
                .build();

        Car minivan = new Car.CarBuilder("Семейный минивен", "1.9 TDI", "Механическая КПП")
                .setCarRoofRack()
                .setCarMats()
                .setAlarm()
                .build();

        Car standardCar = new Car.CarBuilder("Стандартный гражданский автомобиль", "1.3 бензин", "Автоматическая КПП")
                .setWebasto()
                .setCarMats()
                .setAlarm()
                .build();

        System.out.println(sportCar);
        System.out.println(minivan);
        System.out.println(standardCar);

    }
}
