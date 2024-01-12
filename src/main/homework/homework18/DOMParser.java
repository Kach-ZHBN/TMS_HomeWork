package homework.homework18;

import homework.homework18.models.Literature;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParser {

    public static Literature parse(String filePath) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        List<String> lines = new ArrayList<>();

        Document document = builder.parse(new File(filePath));

        NodeList nodeList = document.getElementsByTagName("firstName");
        String firstName = nodeList.item(0).getTextContent();

        nodeList = document.getElementsByTagName("lastName");
        String lastName = nodeList.item(0).getTextContent();

        nodeList = document.getElementsByTagName("title");
        String title = nodeList.item(0).getTextContent();


        nodeList = document.getElementsByTagName("line");
        for (int i = 0; i < nodeList.getLength(); i++) {
            lines.add(nodeList.item(i).getTextContent());
        }
        return new Literature(firstName, lastName, title, lines);
    }

}
