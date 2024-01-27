package homework.homework30.abstractFactory.model.chineseDevice;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public class ChineseComputer extends ElectronicDevice {
    @Override
    public void use() {
        System.out.println("Programming on chinese computer");
    }
}
