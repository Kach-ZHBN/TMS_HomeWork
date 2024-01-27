package homework.homework31.adapter;

public class Adapter implements NewInterface{
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void newMethod() {
        oldSystem.oldMethod();
    }
}
