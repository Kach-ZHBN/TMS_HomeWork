package homework.homework30.abstractFactory.model.americanDevice;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public class SamsungTV extends ElectronicDevice {
    @Override
    public void use() {
        System.out.println("Watching a movie on Samsung");
    }
}
