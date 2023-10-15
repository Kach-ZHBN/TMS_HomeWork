package homework;


import homework.homework8.Animal;
import homework.homework8.Dog;
import homework.homework8.Rabbit;
import homework.homework8.Tiger;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EighthHomework {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /*
        Задача 1:
        Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
        Переопределить методы voice(), eat(String food) чтобы они выводили верную
        информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
        туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
        или другую строку то он будет недоволен.
        Задача *:
        Написать такой конструктор, который запретит создание объекта класса Dog в других
        классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
        обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
        способа
         */
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();

        //Первый способ создания собаки. Через статический метод, который имеет доступ к конструктору.
        Animal dogOne = Dog.createDog();

        //Второй способ создания собаки. Рефлексия.

        Constructor<Dog> constructorDog = Dog.class.getDeclaredConstructor();
        constructorDog.setAccessible(true);
        Animal dogTwo = constructorDog.newInstance();

        rabbit.voice();
        rabbit.eat("Humburger");
        rabbit.eat("Grass");

        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Tree");

        dogOne.voice();
        dogOne.eat("Grass");

        dogTwo.voice();
        dogTwo.eat("Meat");

    }
}
