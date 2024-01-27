package homework.homework30.abstractFactory;

import homework.homework30.abstractFactory.factory.AmericanElectronicDeviceFactory;
import homework.homework30.abstractFactory.factory.ChineseElectronicDeviceFactory;
import homework.homework30.abstractFactory.factory.ElectronicFactory;
import homework.homework30.abstractFactory.model.ElectronicDevice;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ElectronicFactory americanFactory = new AmericanElectronicDeviceFactory();
        ElectronicFactory chineseFactory = new ChineseElectronicDeviceFactory();

        ElectronicDevice electronicDevice = americanFactory.create("iMac");
        electronicDevice.use();

        electronicDevice = chineseFactory.create("Huawei");
        electronicDevice.use();
    }
}
