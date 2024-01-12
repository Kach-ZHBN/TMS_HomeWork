package homework.homework18.SAXParserTMS;

import homework.homework18.models.Literature;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxHandler extends DefaultHandler {
    private boolean bFirstName;
    private boolean bLastName;
    private boolean bTitle;
    private boolean bLine;
    private final Literature literature = new Literature();
    private StringBuilder data;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("firstName")) {
            bFirstName = true;
        } else if (qName.equalsIgnoreCase("lastName")) {
            bLastName = true;
        } else if (qName.equalsIgnoreCase("title")) {
            bTitle = true;
        } else if (qName.equalsIgnoreCase("line")) {
            bLine = true;
        }
        data = new StringBuilder();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (bLine) {
            literature.getLines().add(data.toString());
            bLine = false;
        } else if (bTitle) {
            literature.setTitle(data.toString());
            bTitle = false;
        } else if (bLastName) {
            literature.setLastName(data.toString());
            bLastName = false;
        } else if (bFirstName) {
            literature.setFirstName(data.toString());
            bFirstName = false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }

    public Literature getLiterature() {
        return literature;
    }
}
