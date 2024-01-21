package homework.homework30.abstractFactory.model.americanDevice;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public class iPhone extends ElectronicDevice {
    @Override
    public void use() {
        System.out.println("Calling a contact on iPhone");
    }
}
