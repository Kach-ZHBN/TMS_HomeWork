package homework.homework30.factoryMethod;

import homework.homework30.factoryMethod.model.ElectronicDevice;

public class FactoryTest {

    public static void main(String[] args) {
        ElectronicDeviceFactory electronicDeviceFactory = new ElectronicDeviceFactory();
        ElectronicDevice electronicDevice = electronicDeviceFactory.createElectronicDevice("TV");
        electronicDevice.use();

        electronicDevice = electronicDeviceFactory.createElectronicDevice("Phone");
        electronicDevice.use();

        electronicDevice = electronicDeviceFactory.createElectronicDevice("Radio");
        electronicDevice.use();
    }
}
