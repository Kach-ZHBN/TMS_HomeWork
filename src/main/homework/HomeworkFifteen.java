package homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class HomeworkFifteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double USD_RATE = 3.2;

        /*
        Задача 1:
        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        когда пользователю исполнится 100 лет. Использовать Date/Time API.
         */
        System.out.println("Enter your birthday (yyyy-MM-dd)");
        System.out.println(getHundredthBirthday(scanner.nextLine()));

        /*
        Задача 2:
        Используя Predicate среди массива чисел вывести только те, которые являются
        положительными.
         */
        System.out.println(getPositiveNumbers(new ArrayList<>(List.of(-100, -1, 0, 1, 50, 400))));

        /*
        Задача 3:
        Используя Function реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        возвращать сумму, переведенную сразу в доллары.
         */
        System.out.println(convertFromBYNToUSDFunction("800 BYN", USD_RATE));

        /*
        Задача 4:
        Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        выводить сумму, переведенную сразу в доллары.
         */
        System.out.println(convertFromBYNToUSDConsumer("800 BYN", USD_RATE));

        /*
        Задача 5:
        Используя Supplier написать метод, который будет возвращать введенную с консоли
        строку задом наперед.
         */
        System.out.println("Enter your string");
        System.out.println(getMirrorString(scanner.nextLine()));


    }

    public static LocalDate getHundredthBirthday(String birthday) {
        return LocalDate.parse(birthday).plusYears(100);
    }

    public static List<Integer> getPositiveNumbers(List<Integer> inputNumbers) {
        List<Integer> positiveNumbers = new ArrayList<>();
        Predicate<Integer> isEven = x -> x > 0;
        for (Integer number : inputNumbers) {
            if (isEven.test(number)) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }

    public static String convertFromBYNToUSDFunction(String inputBYN, double USD_RATE) {
        String[] tempBYNString = inputBYN.split(" ");
        double amountBYN = Double.parseDouble(tempBYNString[0]);
        Function<Double, Double> converter = x -> x / USD_RATE;
        return converter.apply(amountBYN) + " USD";
    }

    public static String convertFromBYNToUSDConsumer(String inputBYN, double USD_RATE) {
        String[] tempBYNString = inputBYN.split(" ");
        double amountBYN = Double.parseDouble(tempBYNString[0]);
        StringBuilder stringBuilder = new StringBuilder();
        Consumer<Double> converter = x -> stringBuilder.append(x / USD_RATE);
        converter.accept(amountBYN);
        stringBuilder.append(" USD");
        return stringBuilder.toString();
    }

    public static String getMirrorString(String inputString) {
        Supplier<String> supplier = () -> {
            char[] charSet = inputString.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = charSet.length - 1; i >= 0; i--) {
                stringBuilder.append(charSet[i]);
            }
            return stringBuilder.toString();
        };
        return supplier.get();
    }

}
