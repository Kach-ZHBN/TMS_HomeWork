package homework.homework30.abstractFactory.model.chineseDevice;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public class Huawei extends ElectronicDevice {
    @Override
    public void use() {
        System.out.println("Calling to contact on Huawei");
    }
}
