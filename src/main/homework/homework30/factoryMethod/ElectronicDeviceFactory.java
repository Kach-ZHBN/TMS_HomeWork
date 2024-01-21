package homework.homework30.factoryMethod;

import homework.homework30.factoryMethod.model.*;

public class ElectronicDeviceFactory {
    public ElectronicDevice createElectronicDevice(String type){
        if(type.equals("Computer")){
            return new Computer();
        }else if(type.equals("Phone")){
            return new Phone();
        } else if (type.equals("Radio")) {
            return new Radio();
        } else if (type.equals("TV")) {
            return new TV();
        }else{
            return null;
        }
    }
}
