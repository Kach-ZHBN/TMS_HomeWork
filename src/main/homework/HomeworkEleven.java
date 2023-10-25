package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkEleven {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--------------Homework. Task 1--------------");
            /*
            Задача 1:
            Вывести в консоль из строки которую пользователь вводит с клавиатуры все
            аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
            только из прописных букв, без чисел.
             */
            System.out.println(Arrays.toString(getAbbreviations(scanner.nextLine())));
            System.out.println("--------------------------------------------");

            System.out.println("----------Homework. Difficult task-----------");
            /*
            Задача *:
            Программа на вход получает произвольный текст. В этом тексте может быть номер
            документа(один или несколько), емейл и номер телефона. Номер документа в формате:
            xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
            может содержать не всю информацию, т.е. например, может не содержать номер
            телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
            формате:
            email: teachmeskills@gmail.com
            document number: 1423-1512-51
            и т.д
             */
            String stringForDifficultTask = "Lore1234-9856-11m ipsum YE dolor UYTJHG sit OFT amet, consectetur D " +
                    "1548-6589-12 adipiscing JHFYUK   ED154-5554-23HD ДЖАВА elit. Lore+(29)1485691m ipsum YE do+256854729lor" +
                    " UYTJHG sit OFT amet, consectetur D adipi +(12)7239541 scing JHFYUK EDHD ДЖАВА elit. Lorem" +
                    " kach.zhbn@gmail.com ipsum YE dolor UYTJHG sit OFT amet, consectetur D adipiscing JHFY@gmail.comUK " +
                    "EDHD fgh@gmail.com ДЖАВА elit.";

            System.out.println("Document numbers: " + Arrays.toString(getDocumentNumbers(stringForDifficultTask)));
            System.out.println("Phone numbers: " +Arrays.toString(getPhoneNumbers(stringForDifficultTask)));
            System.out.println("Email: " +Arrays.toString(getEmails(stringForDifficultTask)));

            System.out.println("--------------------------------------------");


            System.out.println("----------Homework. Additional task 1-----------");
            /*
            Задание №1
            Нужно создать группы с числами внутри тегов, текстом между тегами и тегом <objectN> где N это натуральное
            число. Если текст не находится между двумя тегами то он выносится в группу (в рамках задания опустим
            проверку на то, что теги должны быть открывающим и закрывающим, а также содержать одинаковое числовое
            значение). Также если тег находится просто в тексте то он выносится в группу.
             */
            String[][] matchesFromTaskOne = additionalTaskOne("<0>Java <4> Test </4> </0>\n" +
                    "0Hello <object0> World 0\n" +
                    "<1> Hello <object0> World</1> <object0>\n" +
                    "Before<100> object0\n" +
                    "<100> Before After</100>");
            for (String[] strings : matchesFromTaskOne) {
                System.out.println(Arrays.toString(strings));
            }
            System.out.println("--------------------------------------------");

            System.out.println("----------Homework. Additional task 1-----------");
            /*
            Задание №2
            Усложнённая версия задания №1. Здесь мы в группы выносим блоки с тегами. Если встречаем тест без тегов
            то он нам интересен, но он не попадает в группу. А если текст находится внутри тегов то мы помещаем его в
            группу вместе с тегом. Отличием тут является тег <object> который не содержит цифр
             */
            String[][] matchesFromTaskTwo = additionalTaskTwo("<0>Java <4> Test </4> After </0>\n" +
                    "<0>Before Test After </0>\n" +
                    "Before Test After\n" +
                    "Hello <object> World\n" +
                    "<1> Hello World </1>   test <object>");
            for (String[] strings : matchesFromTaskTwo) {
                System.out.println(Arrays.toString(strings));
            }
        }
    }

    public static String[] getAbbreviations(String inputText) {
        String[] abbreviations = new String[0];
        //пробел/знак_пунктуации/начало_строки+(НЕОБХОДИМАЯ_ИНФА)+пробел/знак_пунктуации/конец_строки
        Pattern abbreviationPattern = Pattern.compile("(\\s|\\p{Punct}|\\A)+([A-ZА-Я]{2,6})(\\s|\\p{Punct}|\\Z)+");
        Matcher matcher = abbreviationPattern.matcher(inputText);

        while (matcher.find()) {
            String[] tempStrings = new String[abbreviations.length + 1];
            System.arraycopy(abbreviations, 0, tempStrings, 0, abbreviations.length);
            tempStrings[tempStrings.length - 1] = matcher.group(2);
            abbreviations = tempStrings;
        }
        return abbreviations;
    }

    public static String[] getDocumentNumbers(String inputText) {
        String[] documentNumbers = new String[0];
        //пробел/знак_пунктуации/начало_строки+(НЕОБХОДИМАЯ_ИНФА)+пробел/знак_пунктуации/конец_строки
        Pattern documentNumberPattern = Pattern.compile("(\\s|\\p{Punct}|\\A)+(\\d{4}-\\d{4}-\\d{2})(\\s|\\p{Punct}|\\Z)+");
        Matcher matcher = documentNumberPattern.matcher(inputText);

        while (matcher.find()) {
            String[] tempStrings = new String[documentNumbers.length + 1];
            System.arraycopy(documentNumbers, 0, tempStrings, 0, documentNumbers.length);
            tempStrings[tempStrings.length - 1] = matcher.group(2);
            documentNumbers = tempStrings;
        }
        return documentNumbers;
    }

    public static String[] getPhoneNumbers(String inputText) {
        String[] phoneNumbers = new String[0];
        //(+ - как начало строки НЕОБХОДИМАЯ_ИНФА)+пробел/знак_пунктуации/конец_строки
        Pattern phoneNumberPattern = Pattern.compile("(\\+\\(\\d{2}\\)\\d{7})(\\s|\\p{Punct}|\\Z)+");
        Matcher matcher = phoneNumberPattern.matcher(inputText);

        while (matcher.find()) {
            String[] tempStrings = new String[phoneNumbers.length + 1];
            System.arraycopy(phoneNumbers, 0, tempStrings, 0, phoneNumbers.length);
            tempStrings[tempStrings.length - 1] = matcher.group(1);
            phoneNumbers = tempStrings;
        }
        return phoneNumbers;
    }

    public static String[] getEmails(String inputText) {
        String[] emails = new String[0];
        //пробел/знак_пунктуации/начало_строки+(НЕОБХОДИМАЯ_ИНФА)+пробел/знак_пунктуации/конец_строки
        Pattern emailPattern = Pattern.compile("(\\s|\\p{Punct}|\\A)+([A-Za-z\\d\\._-]+@[a-z]+\\.[a-z]+)(\\s|\\p{Punct}|\\Z)+");
        Matcher matcher = emailPattern.matcher(inputText);

        while (matcher.find()) {
            String[] tempStrings = new String[emails.length + 1];
            System.arraycopy(emails, 0, tempStrings, 0, emails.length);
            tempStrings[tempStrings.length - 1] = matcher.group(2);
            emails = tempStrings;
        }
        return emails;
    }

    public static String[][] additionalTaskOne(String inputText) {
        String[][] matches = new String[0][0];
        Pattern pattern = Pattern.compile("<(\\d+)>(\\d+|.+)</?(\\d+)>|<(\\d+)>|<object(\\d+)>");
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            String[][] tempMatches = new String[matches.length + 1][];
            System.arraycopy(matches, 0, tempMatches, 0, matches.length);
            String[] groups = new String[matcher.groupCount() + 1];
            for (int i = 0; i <= matcher.groupCount(); i++) {
                groups[i] = matcher.group(i);
            }
            tempMatches[tempMatches.length - 1] = groups;
            matches = tempMatches;
        }
        return matches;
    }

    public static String[][] additionalTaskTwo(String inputText) {
        String[][] matches = new String[0][0];
        Pattern pattern = Pattern.compile("(<\\d+>[\\w| ]+</\\d+>)|<\\d+>[\\w| ]+|[\\w| ]+</\\d+>|[\\w| ]+|(<object>)");
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            String[][] tempMatches = new String[matches.length + 1][];
            System.arraycopy(matches, 0, tempMatches, 0, matches.length);
            String[] groups = new String[matcher.groupCount() + 1];
            for (int i = 0; i <= matcher.groupCount(); i++) {
                groups[i] = matcher.group(i);
            }
            tempMatches[tempMatches.length - 1] = groups;
            matches = tempMatches;
        }
        return matches;
    }


}