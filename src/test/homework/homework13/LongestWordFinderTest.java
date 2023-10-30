package homework.homework13;

import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class LongestWordFinderTest {

    @Test
    public void testGetLongWordFromFile() {
        try {
            assertEquals(LongestWordFinder.getLongWordFromFile("src/test/homework/homework13/task1/Empty File.txt"), "");
            assertEquals(LongestWordFinder.getLongWordFromFile("src/test/homework/homework13/task1/File 1.txt"),
                    "рентгеноэлектрокардиографического");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
