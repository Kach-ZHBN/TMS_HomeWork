package homework.homework13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LongestWordFinder {
    public static String getLongWordFromFile(String filePath) throws IOException {
        String longWord = "";
        String splitter = " |\\p{Punct}|\\Z|\\n"; //пробел|знак пунктуации|конец файла|конец строки

        /*1-ый способ. Класс Files.
        Получаю строки из файла. Каждую строку разделяю на слова путем разделения строки по пробелу,
        знаку пунктуации, концу строки или концу файла. Каждое слово сравниваю с уже имеющимся длинным словом.
         */
//        List<String> listString = Files.readAllLines(Paths.get(filePath));
//        for (String string : listString) {
//            String[] words = string.split(splitter);
//            for (String word : words) {
//                if (word.length() > longWord.length()) {
//                    longWord = word;
//                }
//            }
//        }


        /*2-ой способ. FileReader.
        Считываю каждый символ и параллельно формирую слово. Разделителем слов считаю пробел, знак пунктуации, конец строки
        и конец файла. Сформированное слово сравниваю с текущим длинным словом.
         */
        try (FileReader fr = new FileReader(filePath)) {
            int character;
            StringBuilder stringBuilder = new StringBuilder();
            while ((character = fr.read()) != -1) {
                if (new String(String.valueOf((char) character)).matches(splitter)) {
                    if (stringBuilder.length() > longWord.length()) {
                        longWord = stringBuilder.toString();
                    }
                    stringBuilder = new StringBuilder();
                } else {
                    stringBuilder.append((char) character);
                }
            }
        }
        return longWord;
    }
}
