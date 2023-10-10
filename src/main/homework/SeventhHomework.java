package homework;


import homework.homework7.Apple;
import homework.homework7.task1.*;

import java.lang.reflect.Field;

public class SeventhHomework {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("--------------Task 1--------------");
        /*
        Задача 1:
        Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
        хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
        по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
        «Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
        терапевта создать метод, который будет назначать врача пациенту согласно плану
        лечения:
        Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
        Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
        Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
        лечить.
        */
        Therapist therapist = new Therapist();
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        therapist.setDoctors(surgeon, dentist);

        Patient patientOne = new Patient();
        Patient patientTwo = new Patient();
        Patient patientThree = new Patient();

        therapist.chooseDoctor(patientOne);
        patientOne.getTreatment();
        therapist.chooseDoctor(patientTwo);
        patientTwo.getTreatment();
        therapist.chooseDoctor(patientThree);
        patientThree.getTreatment();

        System.out.println("----------------------------------");

        System.out.println("----------Homework. Difficult task----------");
        /*
        Задача *:
        Создать класс Apple и добавить в него поле color с модификатором доступа private и
        инициализировать его. В методе main другого класса создать объект Apple, и не
        используя сеттеры изменить значение поля color.
         */
        Apple apple = new Apple();
        System.out.println("Apple " + apple.getColor());

        Class appleClass = apple.getClass();
        Field colorField = appleClass.getDeclaredField("color");
        colorField.setAccessible(true);
        colorField.set(apple, "red");

        System.out.println("Apple " + apple.getColor());
        System.out.println("--------------------------------------------");
    }
}
