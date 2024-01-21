package homework.homework30.builder;

public class Car {
    private String type;
    private String engine;
    private String transmission;
    private boolean carRoofRack;
    private boolean spoiler;
    private boolean webasto;
    private boolean carMats;
    private boolean alarm;



    public Car(CarBuilder carBuilder){
        this.type = carBuilder.type;
        this.engine = carBuilder.engine;
        this.transmission = carBuilder.transmission;
        this.carRoofRack = carBuilder.carRoofRack;
        this.spoiler = carBuilder.spoiler;
        this.webasto = carBuilder.webasto;
        this.carMats = carBuilder.carMats;
        this.alarm = carBuilder.alarm;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", carRoofRack=" + carRoofRack +
                ", spoiler=" + spoiler +
                ", webasto=" + webasto +
                ", carMats=" + carMats +
                ", alarm=" + alarm +
                '}';
    }

    public static class CarBuilder{
        private String type;
        private String engine;
        private String transmission;
        private boolean carRoofRack;
        private boolean spoiler;
        private boolean webasto;
        private boolean carMats;
        private boolean alarm;

        public CarBuilder(String type, String engine, String transmission) {
            this.type = type;
            this.engine = engine;
            this.transmission = transmission;
            this.carRoofRack = false;
            this.spoiler = false;
            this.webasto = false;
            this.carMats = false;
            this.alarm = false;
        }

        public CarBuilder setCarRoofRack() {
            this.carRoofRack = true;
            return this;
        }

        public CarBuilder setSpoiler() {
            this.spoiler = true;
            return this;
        }

        public CarBuilder setWebasto() {
            this.webasto = true;
            return this;
        }

        public CarBuilder setCarMats() {
            this.carMats = true;
            return this;
        }

        public CarBuilder setAlarm() {
            this.alarm = true;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
