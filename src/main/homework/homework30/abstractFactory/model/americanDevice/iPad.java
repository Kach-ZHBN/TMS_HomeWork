package homework.homework30.abstractFactory.model.americanDevice;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public class iPad extends ElectronicDevice {
    @Override
    public void use() {
        System.out.println("Listen to music on iPad");
    }
}
