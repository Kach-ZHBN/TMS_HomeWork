package homework.homework19.task1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ThreadToFindMaxTest {

    @Test
    public void testGetMaxValue() throws InterruptedException {
        ThreadToFindMax threadToFindMax = new ThreadToFindMax(new double[]{25.3, 65.9, 486.52, -234.5, -2, 0, 6});
        threadToFindMax.start();
        threadToFindMax.join();
        assertEquals(threadToFindMax.getMaxValue(), 486.52);
    }
}