package homework.homework30.abstractFactory.model.chineseDevice;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public class ChineseTV extends ElectronicDevice {
    @Override
    public void use() {
        System.out.println("Watching a movie on chinese TV");
    }
}
