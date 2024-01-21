package homework.homework30.abstractFactory.model.americanDevice;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public class iMac extends ElectronicDevice {
    @Override
    public void use() {
        System.out.println("Programming on iMac");
    }
}
