package homework.homework30.abstractFactory.factory;

import homework.homework30.abstractFactory.model.ElectronicDevice;
import homework.homework30.abstractFactory.model.americanDevice.SamsungTV;
import homework.homework30.abstractFactory.model.americanDevice.iMac;
import homework.homework30.abstractFactory.model.americanDevice.iPad;
import homework.homework30.abstractFactory.model.americanDevice.iPhone;

public class AmericanElectronicDeviceFactory extends ElectronicFactory {
    @Override
    public ElectronicDevice create(String type) {
        if(type.equals("iMac")){
            return new iMac();
        } else if (type.equals("iPad")) {
            return new iPad();
        } else if (type.equals("iPhone")) {
            return new iPhone();
        } else if (type.equals("SamsungTV")) {
            return new SamsungTV();
        }else {
            return null;
        }
    }
}
