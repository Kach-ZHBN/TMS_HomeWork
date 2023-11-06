package homework.homework13;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.testng.Assert.*;

public class DocumentWriterTest {


    @Test
    public void testGetReportFiles() {

        try {
            new DocumentWriter("src/test/homework/homework13/documents1/Document numbers Empty.txt").getReportFiles();
            List<String> invalidDocNumbers = Files.readAllLines(Paths.get("src/test/homework/homework13/documents1/Invalid document numbers.txt"));
            assertTrue(invalidDocNumbers.isEmpty());
            List<String> validDocNumbers = Files.readAllLines(Paths.get("src/test/homework/homework13/documents1/Valid document numbers.txt"));
            assertTrue(validDocNumbers.isEmpty());

            new DocumentWriter("src/test/homework/homework13/documents2/Document numbers.txt").getReportFiles();
            invalidDocNumbers = Files.readAllLines(Paths.get("src/test/homework/homework13/documents2/Invalid document numbers.txt"));
            assertEquals(invalidDocNumbers.get(0), "CONTRACT9012345 | Несоответствующий формат строки ");
            assertEquals(invalidDocNumbers.get(1), "DOCNUM789012345 | Несоответствующий формат строки ");
            assertEquals(invalidDocNumbers.get(2), "DFGHJKL1381asd3518asd531 | Длина строки не равна 15. ");
            assertEquals(invalidDocNumbers.get(3), "docnum*@9012345 | Недопустимые символы в строке. Несоответствующий формат строки ");
            assertEquals(invalidDocNumbers.get(4), "123docnum012345 | Несоответствующий формат строки ");

            validDocNumbers = Files.readAllLines(Paths.get("src/test/homework/homework13/documents2/Valid document numbers.txt"));
            assertEquals(validDocNumbers.get(0), "docnum789012345");
            assertEquals(validDocNumbers.get(1), "docnumSDASDCASD");
            assertEquals(validDocNumbers.get(2), "docnumasfasczxa");
            assertEquals(validDocNumbers.get(3), "docnum748hd8s9s");
            assertEquals(validDocNumbers.get(4), "contract9012345");
            assertEquals(validDocNumbers.get(5), "contractAJSNKSI");
            assertEquals(validDocNumbers.get(6), "contractasdfcas");
            assertEquals(validDocNumbers.get(7), "contract415sas8");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}