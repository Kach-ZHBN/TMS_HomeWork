package homework.homework30.abstractFactory.factory;

import homework.homework30.abstractFactory.model.ElectronicDevice;
import homework.homework30.abstractFactory.model.chineseDevice.ChineseComputer;
import homework.homework30.abstractFactory.model.chineseDevice.ChineseRadio;
import homework.homework30.abstractFactory.model.chineseDevice.ChineseTV;
import homework.homework30.abstractFactory.model.chineseDevice.Huawei;

public class ChineseElectronicDeviceFactory extends ElectronicFactory{
    @Override
    public ElectronicDevice create(String type) {
        if(type.equals("ChineseComputer")){
            return new ChineseComputer();
        } else if (type.equals("ChineseRadio")) {
            return new ChineseRadio();
        } else if (type.equals("Huawei")) {
            return new Huawei();
        } else if (type.equals("ChineseTV")) {
            return new ChineseTV();
        }else {
            return null;
        }
    }
}
