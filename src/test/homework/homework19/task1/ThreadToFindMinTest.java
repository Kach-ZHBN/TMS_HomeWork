package homework.homework19.task1;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.Assert.*;

public class ThreadToFindMinTest {

    @Test
    public void testGetMinValue() throws InterruptedException {
        ThreadToFindMin threadToFindMin = new ThreadToFindMin(new double[]{25.3, 65.9, 486.52, -234.5, -2, 0, 6});
        threadToFindMin.start();
        threadToFindMin.join();
        assertEquals(threadToFindMin.getMinValue(), -234.5);
    }
}