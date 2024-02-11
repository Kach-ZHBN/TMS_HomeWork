package homework.homework38;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MyService myService = context.getBean(MyService.class);

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        myService.method1(list);
        myService.method2();
        myService.check();
    }
}
