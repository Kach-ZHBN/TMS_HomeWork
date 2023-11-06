package homework;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomeworkFourteenTest {

    @Test
    public void testGetUniqueNumbers() {
        assertEquals(HomeworkFourteen.getUniqueNumbers(""), "[]");
        assertEquals(HomeworkFourteen.getUniqueNumbers("1,2,3,4,5,6"), "[1, 2, 3, 4, 5, 6]");
        assertEquals(HomeworkFourteen.getUniqueNumbers("1 2 3 4 5 6"), "[1, 2, 3, 4, 5, 6]");
        assertEquals(HomeworkFourteen.getUniqueNumbers("1, 2 3    ; 4; 5....6"), "[1, 2, 3, 4, 5, 6]");
    }
}