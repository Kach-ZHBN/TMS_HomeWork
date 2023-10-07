package homework;

import homework.homework6.Calculator;
import homework.homework6.CreditCard;
import homework.homework6.Person;
import homework.homework6.atm.ATM;

public class SixthHomework {
    public static void main(String[] args) {

        System.out.println("--------------Practice. Task 1--------------");
        /*
        Задача 1:
        1.1 Создать класс Calculator с полями weight, cost, color и заполнить их. И методами
        нахождения суммы, разности, деления, умножения двух чисел. Метод main в этом классе
        не создавать !
        1.2 Создать объект класса Calculator в main методе другого класса. Проверить работу
        методов и вывести в консоль значения полей weight, cost, color.
        1.3 Создать конструктор для класса Calculator, чтобы иметь возможность
        инициализировать поля в момент создания объекта. Также в логическом блоке добавить
        вывод в консоль, создаётся объект Calculator.
        */
        Calculator calculator = new Calculator(200, 20, "Black");

        System.out.println("Weight of the calculator: " + calculator.getWeight());
        System.out.println("Cost of the calculator: " + calculator.getCost());
        System.out.println("Color of the calculator: " + calculator.getColor());
        System.out.println("4.6 + 84.6 = " + calculator.sum(4.6, 84.6));
        System.out.println("45.9 - 14.4 = " + calculator.subtraction(45.9, 14.4));
        System.out.println("369 / 3 = " + calculator.division(369, 3));
        System.out.println("369 / 0 = " + calculator.division(369, 0));
        System.out.println("24 * 5.5 =" + calculator.multiplication(24, 5.5));

        System.out.println("--------------------------------------------");

        System.out.println("--------------Practice. Task 2--------------");
        /*
        Задача 2:
        2.1 Создать класс Person, который содержит: переменные fullName, age; методы
        talk(String text) и move(), в которых вывести на консоль сообщение -"*fullName* talk
        *text*..." и "*fullName* walk.".
        2.2 Добавьте два конструктора - Person() и Person(fullName, age).
        2.3 Создайте два объекта этого класса. Один объект инициализируется конструктором
        Person(), другой - Person(fullName, age). Вызовите методы move() и talk()
        */
        Person personOne = new Person();
        Person personTwo = new Person("Alex", 22);

        personOne.talk("My name is " + personOne.getFullName() + ". I'm " + personOne.getAge() + " years old");
        personOne.move();

        personTwo.talk("My name is " + personTwo.getFullName() + ". I'm " + personTwo.getAge() + " years old");
        personTwo.move();

        System.out.println("--------------------------------------------");

        System.out.println("--------------Homework. Task 2--------------");
        /*
        Задача 1:
        Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
        метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
        который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
        выводит текущую информацию о карточке. Напишите программу, которая создает три
        объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
        третьей. Выведите на экран текущее состояние всех трех карточек
         */

        CreditCard creditCardOne = new CreditCard(1111, 456.32);
        CreditCard creditCardTwo = new CreditCard(2222, 12.75);
        CreditCard creditCardThree = new CreditCard(3333, 198.56);

        creditCardOne.addMoney(43.68);
        creditCardTwo.addMoney(100.50);
        creditCardThree.getMoney(50);

        System.out.println(creditCardOne);
        System.out.println(creditCardTwo);
        System.out.println(creditCardThree);

        System.out.println("--------------------------------------------");

        System.out.println("----------Homework. Difficult task----------");
        /*
        Задача *:
        Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
        задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
        метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
        принимает сумму денег, а возвращает булевое значение - успешность выполнения
        операции. При снятии денег, функция должна распечатывать каким количеством купюр
        какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
        количеством купюр каждого номинала.
        В задаче со * как усложнение необходимо реализовать приложение так, чтобы в
        отсутствии возможности снять всю сумму исходя из количества денег и/или доступного
        номинала вам предлагалось снять ближайшее допустимое количество
         */

        ATM atm = new ATM(1,8, 3);
        atm.getMoney(135);
        atm.addMoney(20, 15, 10);
        atm.getMoney(1350);
        atm.getMoney(870);
        System.out.println("--------------------------------------------");


    }
}
