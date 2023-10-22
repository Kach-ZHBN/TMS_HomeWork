package homework.homework9.builder;

import java.util.Arrays;

/*
Электронное устройство, которое состоит из печатной платы, набора компоннетов и проводов, припоя и корпуса.
Возможными параметрами являются - необходимость упаковки, необходимость доставки заказчику.
 */
public class ElectronicDevice {
    private PCB pcb;
    private Component[] components;
    private SolderType solderType;
    private Wire[] wires;
    private DeviceCase deviceCase;
    private boolean hasPacking;
    private boolean hasDeliveryToCustomer;

    public PCB getPcb() {
        return pcb;
    }

    public void setPcb(PCB pcb) {
        this.pcb = pcb;
    }

    public Component[] getComponents() {
        return components;
    }

    public void setComponents(Component[] components) {
        this.components = components;
    }

    public SolderType getSolderType() {
        return solderType;
    }

    public void setSolderType(SolderType solderType) {
        this.solderType = solderType;
    }

    public Wire[] getWires() {
        return wires;
    }

    public void setWires(Wire[] wires) {
        this.wires = wires;
    }

    public DeviceCase getDeviceCase() {
        return deviceCase;
    }

    public void setDeviceCase(DeviceCase deviceCase) {
        this.deviceCase = deviceCase;
    }

    public boolean isHasPacking() {
        return hasPacking;
    }

    public void setHasPacking(boolean hasPacking) {
        this.hasPacking = hasPacking;
    }

    public boolean isHasDeliveryToCustomer() {
        return hasDeliveryToCustomer;
    }

    public void setHasDeliveryToCustomer(boolean hasDeliveryToCustomer) {
        this.hasDeliveryToCustomer = hasDeliveryToCustomer;
    }

    public ElectronicDevice(ElectronicDeviceBuilder electronicDeviceBuilder) {
        this.pcb = electronicDeviceBuilder.pcb;
        this.components = electronicDeviceBuilder.components;
        this.solderType = electronicDeviceBuilder.solderType;
        this.wires = electronicDeviceBuilder.wires;
        this.deviceCase = electronicDeviceBuilder.deviceCase;
        this.hasPacking = electronicDeviceBuilder.hasPacking;
        this.hasDeliveryToCustomer = electronicDeviceBuilder.hasDeliveryToCustomer;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "pcb=" + pcb +
                ", components=" + Arrays.toString(components) +
                ", solderType=" + solderType +
                ", wires=" + Arrays.toString(wires) +
                ", deviceCase=" + deviceCase +
                ", hasPacking=" + hasPacking +
                ", hasDeliveryToCustomer=" + hasDeliveryToCustomer +
                '}';
    }

    //Builder
    public static class ElectronicDeviceBuilder {
        private final PCB pcb;
        private final Component[] components;
        private final SolderType solderType;
        private final Wire[] wires;
        private final DeviceCase deviceCase;
        private boolean hasPacking = false;
        private boolean hasDeliveryToCustomer = false;


        public ElectronicDeviceBuilder(PCB pcb, Component[] components, SolderType solderType, Wire[] wires, DeviceCase deviceCase) {
            this.pcb = pcb;
            this.components = components;
            this.solderType = solderType;
            this.wires = wires;
            this.deviceCase = deviceCase;
        }

        public ElectronicDeviceBuilder setHasPacking() {
            this.hasPacking = true;
            return this;
        }

        public ElectronicDeviceBuilder setHasDeliveryToCustomer() {
            this.hasPacking = true; // Без упаковки не доставляем.
            this.hasDeliveryToCustomer = true;
            return this;
        }

        public ElectronicDevice build() {
            return new ElectronicDevice(this);
        }

    }
}
