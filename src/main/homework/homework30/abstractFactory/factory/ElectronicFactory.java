package homework.homework30.abstractFactory.factory;

import homework.homework30.abstractFactory.model.ElectronicDevice;

public abstract class ElectronicFactory {
    public abstract ElectronicDevice create(String type);
}
