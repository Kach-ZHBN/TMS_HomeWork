package homework;

import homework.homework9.builder.*;
import homework.homework9.task1.Accountant;
import homework.homework9.task1.Director;
import homework.homework9.task1.PrintablePosition;
import homework.homework9.task1.Worker;
import homework.homework9.task2.Circle;
import homework.homework9.task2.Figure;
import homework.homework9.task2.Rectangle;
import homework.homework9.task2.Triangle;

public class NinthHomework {
    public static void main(String[] args) {
        System.out.println("--------------Homework. Task 1--------------");
        /*
        Задача 1:
        Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        который печатает название должности и имплементировать этот метод в созданные
        классы.
        */
        PrintablePosition director = new Director();
        PrintablePosition accountant = new Accountant();
        PrintablePosition worker = new Worker();

        director.printPosition();
        accountant.printPosition();
        worker.printPosition();
        System.out.println("--------------------------------------------");

        System.out.println("--------------Homework. Task 2--------------");
        /*
        Задача 2:
        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        периметра всех фигур в массиве.
        */
        Figure[] figures = new Figure[5];
        double resultPerimeter = 0;

        figures[0] = new Rectangle(10, 5);
        figures[1] = new Circle(7);
        figures[2] = new Triangle(3, 4, 5);
        figures[3] = new Rectangle(14.3, 6.45);
        figures[4] = new Circle(46.3);

        for (Figure figure : figures) {
            resultPerimeter += figure.getPerimeter();
        }

        System.out.println("Sum of perimeters = " + resultPerimeter);


        System.out.println("--------------------------------------------");

        System.out.println("--------------Homework. Difficult task--------------");
        /*
        Задача 2:
        Реализовать паттерн builder с использованием вложенных классов. Использовал близкую для меня предметную область - электроника.
        Создаю электронное устройство, которое состоит из печатной платы, электронных компонентов, припоя, проводов и корпуса.
        Необязательными полями являются - необходимость упаковки, необходимость доставки заказчику.
        */
        PCB pcb = new PCB(10, 15);
        Component[] components = new Component[]{new Component("ASCQDR30-B2231R0R105"),
                new Component("UMZ18NT106"), new Component("RP0805BRD0720KL")};
        Wire[] wires = new Wire[]{new Wire(20, 1), new Wire(20, 1)};
        DeviceCase deviceCase = new DeviceCase(15, 20, 3);

        //Тестовый сценарий 1 - без упаковки, без доставки
        ElectronicDevice lamp1 = new ElectronicDevice.ElectronicDeviceBuilder(pcb, components, SolderType.LEADFREE,
                wires, deviceCase).build();

        //Тестовый сценарий 2 - с упаковкой, без доставки
        ElectronicDevice lamp2 = new ElectronicDevice.ElectronicDeviceBuilder(pcb, components, SolderType.LEADFREE,
                wires, deviceCase).setHasPacking().build();

        //Тестовый сценарий 3 - с доставкой (доставка только в упакованном виде)
        ElectronicDevice lamp3 = new ElectronicDevice.ElectronicDeviceBuilder(pcb, components, SolderType.LEADFREE,
                wires, deviceCase).setHasDeliveryToCustomer().build();

        System.out.println("Lamp 1: " + lamp1);
        System.out.println("Lamp 2: " + lamp2);
        System.out.println("Lamp 3: " + lamp3);

        System.out.println("--------------------------------------------");
    }
}
