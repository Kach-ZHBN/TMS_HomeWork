package homework.homework30.abstractFactory.model.chineseDevice;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public class ChineseRadio extends ElectronicDevice {
    @Override
    public void use() {
        System.out.println("Listen to music on chinese radio");
    }
}
