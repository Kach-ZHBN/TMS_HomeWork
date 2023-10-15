package homework.homework9.builder;

/*
Электронный компонент, который имеет номер производителя.
 */
public class Component {
    private String partNumber;

    public Component(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return partNumber;
    }
}
