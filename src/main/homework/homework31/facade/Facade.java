package homework.homework31.facade;

public class Facade {
    private ClassA classA;
    private ClassB classB;
    private ClassC classC;

    public Facade() {
        this.classA = new ClassA();
        this.classB = new ClassB();
        this.classC = new ClassC();
    }

    public void execute(){
        classA.doSomething();
        classB.doSomething();
        classC.doSomething();
    }
}
