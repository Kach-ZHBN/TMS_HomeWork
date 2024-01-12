package homework;

import homework.homework18.DOMParser;
import homework.homework18.SAXParserTMS.SAXParserTMS;
import homework.homework18.models.Literature;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeworkEighteen {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        System.out.println("1 - SAX\n2 - DOM");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        if (value.equals("1")) {
            Literature literature = SAXParserTMS.parse("src/resources/homework18/XMLfile.xml");
            writeToFile(literature, "SAX");
        } else if (value.equals("2")) {
            Literature literature = DOMParser.parse("src/resources/homework18/XMLfile.xml");
            writeToFile(literature, "DOM");
        } else {
            System.out.println("Try again");
        }
    }

    private static void writeToFile(Literature literature, String postfix) throws IOException {
        FileWriter fileWriter = new FileWriter("src/resources/homework18/" + literature.getFirstName() + "_" +
                literature.getLastName() + "_" + literature.getTitle() + "_" + postfix + ".txt");
        fileWriter.write(literature.toString());
        fileWriter.flush();
        fileWriter.close();
    }
}
