package homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeworkTen {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //Ввод трех строк для всех заданий
            String[] strings = new String[3];
            for (int i = 0; i < strings.length; i++) {
                System.out.println("Enter string " + (i + 1));
                strings[i] = scanner.nextLine();
            }

            System.out.println("--------------Task 1--------------");
            /*
            1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
            найденные строки и их длину.
            */
            System.out.println("MIN: " + getMinStringByLength(strings) +
                    " (Length = " + getMinStringByLength(strings).length() + ")");
            System.out.println("MAX: " + getMaxStringByLength(strings) +
                    " (Length = " + getMaxStringByLength(strings).length() + ")");
            System.out.println("----------------------------------");

            System.out.println("--------------Task 2--------------");
            /*
            2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
            значений их длины.
            */
            String[] sortedString = sortByLength(strings);
            for (String stringElement : sortedString) {
                System.out.println(stringElement);
            }
            System.out.println("----------------------------------");

            System.out.println("--------------Task 3--------------");
            /*
            3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
            средней, а также их длину
            */
            double averageLengthOfStrings = getAverageLengthOfStrings(strings);
            System.out.println("Average length of strings = " + averageLengthOfStrings);
            for (String string : strings) {
                if (string.length() < averageLengthOfStrings)
                    System.out.println(string + " with length " + string.length());
            }
            System.out.println("----------------------------------");

            System.out.println("--------------Task 4--------------");
            /*
            4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
            Если таких слов несколько, найти первое из них.
            */

            System.out.println("The first word with unique characters: " + getWordWithUniqueChars(strings));
            System.out.println("----------------------------------");

            System.out.println("--------------Task 5--------------");
            /*
            5. Вывести на консоль новую строку, которой задублирована каждая буква из
            начальной строки. Например, "Hello" -> "HHeelllloo"
            */

            System.out.println("Enter string for task 5");
            String stringForDuplicate = scanner.nextLine();
            System.out.println(stringForDuplicate + " -> " + getStringWithDuplicatedChars(stringForDuplicate));

            System.out.println("----------------------------------");

            System.out.println("--------------Difficult task--------------");
            /*
            Дана строка произвольной длины с произвольными словами. Написать программу для
            проверки является ли любое выбранное слово в строке палиндромом.
            Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
            слово в этой строке палиндромом.
            Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
            в строке 5 слов, а на вход программе передали число 500
            */

            //7-ое слово является палиндромом
            String inputString = "Lorem ipsum dolor sit amet, consectetur repaper adipiscing elit. Cras convallis condimentum " +
                    "ipsum, vel lacinia ex. Phasellus fermentum, mauris id semper suscipit, ante lectus posuere odio, " +
                    "vitae tempor lectus nisi eget tortor. Duis egestas odio quis enim rutrum, imperdiet pretium arcu " +
                    "facilisis. Fusce vehicula diam a vulputate dignissim. Vestibulum ante ipsum primis in faucibus " +
                    "orci luctus et ultrices posuere cubilia curae; Nullam laoreet quam ut suscipit sodales. Proin " +
                    "facilisis at nibh in tincidunt. Pellentesque ligula felis, porttitor in mauris at, interdum " +
                    "porttitor lacus. Etiam sapien ex, euismod quis lobortis vel, tristique et lorem. Nulla facilisi.";
            String[] words = inputString.split("\\p{Punct}?\s+|\\p{Punct}");

            try {
                System.out.print("Enter the word number to define palindrome ");
                int numberOfPalindrome = scanner.nextInt();
                if (numberOfPalindrome < 1 || numberOfPalindrome > words.length) {
                    System.out.println("INPUT ERROR. The number is outside the words range (1 - " + words.length + ")");
                } else {
                    System.out.println(words[numberOfPalindrome - 1] + " is palindrome = "
                            + isPalindrome(words[numberOfPalindrome - 1]));
                }
            } catch (InputMismatchException e) {
                System.out.println("INPUT ERROR. The input number is not an Integer");
            }

            System.out.println("----------------------------------");
            System.out.println("--------------Additional task--------------");
            /*
            Есть строка содержащая абзацы. Необходимо написать метод, который на вход получает
            строку, а на выходе возвращает массив строк содержащий все слова в тексте, НО при
            этом также содержащие и символ перехода на новую строку.
            */
            String stringForAdditionalTask = "Lorem\nipsum dolor sit amet consectetur adipiscing elit\n" +
                    "nulla ac est et diam dignissim tincidunt\n\n\nDonec nec varius nisi ut suscipit justo";
            String[] wordsFromAdditionalTask = getWordsFromString(stringForAdditionalTask);
            //Test
            System.out.println("Number of words = " + wordsFromAdditionalTask.length);
            for (String word : wordsFromAdditionalTask) {
                System.out.println(word);
            }
            System.out.println("----------------------------------");
        }
    }
    /*
    Получение минимальной строки по ее длине
     */
    public static String getMinStringByLength(String[] strings) {
        String[] sortedStringsByLength = sortByLength(strings);
        return sortedStringsByLength[0];
    }

    /*
    Получение маскимальной строки по ее длине
     */
    public static String getMaxStringByLength(String[] strings) {
        String[] sortedStringsByLength = sortByLength(strings);
        return sortedStringsByLength[sortedStringsByLength.length - 1];
    }

    /*
    Сортировка строк по их длине
     */
    public static String[] sortByLength(String[] inputStrings) {
        String[] sortedStringsByLength = Arrays.copyOf(inputStrings, inputStrings.length);

        Arrays.sort(sortedStringsByLength, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        return sortedStringsByLength;
    }

    /*
    Получение средней длины строки из набора строк
     */
    public static double getAverageLengthOfStrings(String[] strings) {
        double averageLengthOfStrings = 0;
        for (String string : strings) {
            averageLengthOfStrings += string.length();
        }
        return averageLengthOfStrings / strings.length;
    }

    /*
    Проверка слова на наличие уникальных символов
     */
    public static boolean isConsistOfUniqueChars(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                return false;
            }
        }
        return true;
    }

    /*
    Проверяю полученный текст на наличие слов с уникальным набором символов.
     */
    public static String getWordWithUniqueChars(String[] strings) {
        for (String string : strings) {
            String[] words = string.split("\\p{Punct}?\s+|\\p{Punct}");
            for (String word : words) {
                if (isConsistOfUniqueChars(word)) {
                    return word;
                }
            }
        }
        return "";
    }

    //Дублирование символов
    public static String getStringWithDuplicatedChars(String string) {
        char[] resultCharSet = new char[string.length() * 2];
        for (int i = 0; i < string.length(); i++) {
            resultCharSet[i * 2] = string.charAt(i);
            resultCharSet[i * 2 + 1] = string.charAt(i);
        }
        return new String(resultCharSet);
    }

    /*
    Сравниваю символы от краев слова к центру.
     */
    public static boolean isPalindrome(String string) {
        char[] word = string.toCharArray();
        for (int i = 0; i < word.length / 2; i++) {
            if (word[i] != word[word.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /*
    Разбиваю строку на массив симоволов. Прохожу по каждому элементу массива. Если текущий элемент массива - символ, то
    добавляю символ в переменный массив, если элемент - это пробел, то из массива формирую слово и добавляю в конечный
    массива. Если элемент массива - это перенос строки, тогда добавляю символ в переменный массив, формирую слово и
    добавляю его в конечный массив.
     */
    public static String[] getWordsFromString(String string) {
        String[] resultWords = new String[0];
        char[] word = new char[0];

        if(string.length() < 2){
            return new String[]{string};
        }

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\n' || i == chars.length - 1) {
                char[] tempWord = new char[word.length + 1];
                System.arraycopy(word, 0, tempWord, 0, word.length);
                tempWord[tempWord.length - 1] = chars[i];
                resultWords = addWordToStringsArray(resultWords, new String(tempWord));
                word = new char[0];
            } else if (chars[i] == ' ') {
                resultWords = addWordToStringsArray(resultWords, new String(word));
                word = new char[0];
            } else {
                char[] tempWord = new char[word.length + 1];
                System.arraycopy(word, 0, tempWord, 0, word.length);
                tempWord[tempWord.length - 1] = chars[i];
                word = tempWord;
            }
        }
        return resultWords;
    }

    /*
    Функция для добавления элемента в массив строк. Создал для удобства работы с массивом.
     */
    public static String[] addWordToStringsArray(String[] inputString, String word) {
        String[] outputString = new String[inputString.length + 1];
        System.arraycopy(inputString, 0, outputString, 0, inputString.length);
        outputString[outputString.length - 1] = word;
        return outputString;
    }


}
