package homework.homework31.adapter;

import org.checkerframework.checker.units.qual.A;

public class AdapterTest {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        NewInterface newInterface = new Adapter(oldSystem);

        Client client = new Client();
        client.doSomething(newInterface);
    }
}
