package homework.homework30.prototype;

public class Car {
    private String type;
    private String engine;
    private String transmission;

    public Car(String type, String engine, String transmission) {
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Car(Car targetCar) {
        if (targetCar != null) {
            this.type = targetCar.getType();
            this.engine = targetCar.getEngine();
            this.transmission = targetCar.getTransmission();
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Car copy (){
        return new Car(this);
    }

}
