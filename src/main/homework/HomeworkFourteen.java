
package homework;

import homework.homework14.AnimalList;
import homework.homework14.Student;
import homework.homework14.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkFourteen {

    public static void main(String[] args) {
        /*
        Задача 1:
        Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        При решении использовать коллекции. Дополнительное условие это не использовать Set.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of numbers");
        System.out.println(getUniqueNumbers(scanner.nextLine()));

        /*
        Задача 2:
        Создать класс, который будет хранить в себе коллекцию с названиями животных.
        Реализовать методы удаления и добавления животных по следующим правилам:
        добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
        объекта этого класса в main методе другого класса.
         */
        AnimalList animalList = new AnimalList();
        animalList.addAnimal("Tiger");
        System.out.println(animalList);
        animalList.addAnimal("Lion");
        System.out.println(animalList);
        animalList.addAnimal("Rabbit");
        System.out.println(animalList);
        animalList.deleteAnimal();
        System.out.println(animalList);
        animalList.deleteAnimal();
        System.out.println(animalList);
        animalList.deleteAnimal();
        System.out.println(animalList);

        /*
        Задача 3:
        Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
        оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
        Написать метод, который удаляет студентов со средним баллом <3. Если средний
        балл>=3, студент переводится на следующий курс. Дополнительно написать метод
        printStudents(List<Student> students, int course), который получает список студентов и
        номер курса. А также печатает на консоль имена тех студентов из списка, которые
        обучаются на данном курсе.
         */
        University university = new University();

        Student studentOne = new Student("Alex", "PE-16", 2, 4, 5, 4, 3, 5);
        Student studentTwo = new Student("John", "IS-42", 4, 3, 3, 3, 3, 3);
        Student studentThree = new Student("Mary", "AS-10", 1, 5, 5, 4, 5, 5);
        Student studentFour = new Student("Mason", "PE-16", 2, 2, 3, 3, 2, 2);
        Student studentFive = new Student("Michael", "PE-14", 4, 2, 2, 3, 2, 2);
        Student studentSix = new Student("Ethan", "PE-16", 2, 2, 3, 3, 2, 2);
        Student studentSeven = new Student("Jacob", "PE-16", 2, 5, 4, 3, 2, 2);
        Student studentEight = new Student("William", "PE-16", 2, 3, 4, 5, 3, 2);

        university.addStudent(studentOne);
        university.addStudent(studentTwo);
        university.addStudent(studentThree);
        university.addStudent(studentFour);
        university.addStudent(studentFive);
        university.addStudent(studentSix);
        university.addStudent(studentSeven);
        university.addStudent(studentEight);

        System.out.println("Before session");
        university.printAllStudent();

        university.session();

        System.out.println("After session");
        university.printAllStudent();

        System.out.println("2nd course");
        University.printStudents(university.getStudentList(), 2);
        System.out.println("3rd course");
        University.printStudents(university.getStudentList(), 3);
    }


    public static String getUniqueNumbers(String inputString) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);
        List<String> uniqueNumbers = new ArrayList<>();

        while (matcher.find()) {
            if (!uniqueNumbers.contains(matcher.group())) {
                uniqueNumbers.add(matcher.group());
            }
        }
        return uniqueNumbers.toString();
    }
}


