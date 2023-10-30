package homework;

import homework.homework13.DocumentWriter;
import homework.homework13.LongestWordFinder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeworkThirteen {

    public static void main(String[] args) {

        /*
        Задача 1:
        В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
        Проанализировать и записать в другой файл самое длинное слово.
         */
        try (FileWriter fw = new FileWriter("src/resources/homework13/Longest word from Romeo and Juliet.txt")) {
            fw.write(LongestWordFinder.getLongWordFromFile("src/resources/homework13/Ромео и Джульетта.txt"));
            fw.flush();
        } catch (IOException e) {
            System.out.println("File not found");
            ;
        }

        /*
        Задача *:
        Допустим есть txt файл с номерами документов. Номером документа является строка,
        состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
        номер документа с новой строки и в строке никакой другой информации, только номер
        документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
        последовательности docnum(далее любая последовательность букв/цифр) или
        contract(далее любая последовательность букв/цифр). Написать программу для чтения
        информации из входного файла - путь к входному файлу должен задаваться через
        консоль. Программа должна проверять номера документов на валидность. Валидные
        номера документов следует записать в один файл-отчет. Невалидные номера документов
        следует записать в другой файл-отчет, но после номеров документов следует добавить
        информацию о том, почему этот документ не валиден.
         */

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter file path");
            DocumentWriter documentWriter = new DocumentWriter(scanner.nextLine());
            documentWriter.getReportFiles();
        } catch (IOException e) {
            System.out.println("File not found. Invalid path.");;
        }


    }
}
