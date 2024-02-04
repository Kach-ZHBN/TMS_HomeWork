package homework;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class HomeworkThirtySixTest {

    @Test
    public void testWordMultiple() {
        Map<String, Boolean> actual;
        Map<String, Boolean> expected = new HashMap<>();

        actual = HomeworkThirtySix.wordMultiple(new String[0]);
        assertEquals(actual, expected);

        actual = HomeworkThirtySix.wordMultiple(new String[]{"a", "b", "a", "c", "b"});
        expected.clear();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);
        assertEquals(actual, expected);

        actual = HomeworkThirtySix.wordMultiple(new String[]{"c", "b", "a"});
        expected.clear();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);
        assertEquals(actual, expected);

        actual = HomeworkThirtySix.wordMultiple(new String[]{"c", "c", "c", "c"});
        expected.clear();
        expected.put("c", true);
        assertEquals(actual, expected);

        actual = HomeworkThirtySix.wordMultiple(new String[]{"C", "c", "c", "c"});
        expected.clear();
        expected.put("c", true);
        expected.put("C", false);
        assertEquals(actual, expected);

    }

    @Test
    public void testPairs() {
        Map<String, String> actual;
        Map<String, String> expected = new HashMap<>();

        actual = HomeworkThirtySix.pairs(new String[0]);
        assertEquals(actual, expected);

        actual = HomeworkThirtySix.pairs(new String[]{"code", "bug"});
        expected.clear();
        expected.put("b", "g");
        expected.put("c", "e");
        assertEquals(actual, expected);

        actual = HomeworkThirtySix.pairs(new String[]{"man", "moon", "main"});
        expected.clear();
        expected.put("m", "n");
        assertEquals(actual, expected);

        actual = HomeworkThirtySix.pairs(new String[]{"man", "moon", "good", "night"});
        expected.clear();
        expected.put("g", "d");
        expected.put("m", "n");
        expected.put("n", "t");
        assertEquals(actual, expected);
    }

    @Test
    public void testIsBalanced() {
        assertTrue(HomeworkThirtySix.isBalanced(""));
        assertTrue(HomeworkThirtySix.isBalanced("()"));
        assertTrue(HomeworkThirtySix.isBalanced("[()]"));
        assertTrue(HomeworkThirtySix.isBalanced("{[()]}"));
        assertTrue(HomeworkThirtySix.isBalanced("([{{[(())]}}])"));

        assertFalse(HomeworkThirtySix.isBalanced("{"));
        assertFalse(HomeworkThirtySix.isBalanced("{{[]()}}}}"));
        assertFalse(HomeworkThirtySix.isBalanced("{[(])}"));

    }
}