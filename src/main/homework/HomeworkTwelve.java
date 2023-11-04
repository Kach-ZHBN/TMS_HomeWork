package homework;

import homework.homework12.PasswordValidator;
import homework.homework12.WrongLoginException;
import homework.homework12.WrongPasswordException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeworkTwelve {
    public static void main(String[] args) {
        /*
        Задача 1:
        Создать класс, в котором будет статический метод. Этот метод принимает на вход три
        параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
        login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
        соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
        password должна быть меньше 20 символов, не должен содержать пробелом и должен
        содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
        Если password не соответствует этим требованиям, необходимо выбросить
        WrongPasswordException. WrongPasswordException и WrongLoginException -
        пользовательские классы исключения с двумя конструкторами – один по умолчанию,
        второй принимает сообщение исключения и передает его в конструктор класса Exception.
        Метод возвращает true, если значения верны, false в противном случае.
        */
        System.out.println(PasswordValidator.isValid("lo gin", "password2", "password2"));
        System.out.println(PasswordValidator.isValid("login", "password2", "word"));
        System.out.println(PasswordValidator.isValid("login", "password6", "password6"));


            /*
            Задача *:
               Написать try/catch/finally, в котором finally вызван не будет.
             */
        //1-ый способ - завершить работу JVM
        try {
            System.exit(1);
        } finally {
            System.out.println("FINALLY");
        }

        //2-ой способ - привести приложение к ошибке, например, OutOfMemory.
        List<Long> longList = new ArrayList<>();
        Random random = new Random();
        try {
            while(true){
                longList.add(random.nextLong());
            }
        }finally {
            System.out.println("FINALLY");
        }

    }
}
