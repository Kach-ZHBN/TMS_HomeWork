package homework.homework14;

import java.util.LinkedList;

/*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
объекта этого класса в main методе другого класса.
 */
public class AnimalList {
    private final LinkedList<String> animals;

    public AnimalList() {
        animals = new LinkedList<>();
    }

    public void addAnimal(String animal){
        animals.addFirst(animal);
    }

    public void deleteAnimal(){
        animals.pollLast();
    }

    @Override
    public String toString() {
        return animals.toString();
    }
}
