package homework;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomeworkTenTest {

    @Test
    public void testGetMinStringByLength() {
        assertEquals(HomeworkTen.getMinStringByLength(new String[]{"123", "", "asdfghjk", "\n"}), "");
    }

    @Test
    public void testGetMaxStringByLength() {
        assertEquals(HomeworkTen.getMaxStringByLength(new String[]{"123", "", "asdfghjk", "\n"}), "asdfghjk");
    }

    @Test
    public void testSortByLength() {
        assertEquals(HomeworkTen.sortByLength(new String[]{"123", "", "asdfghjk", "\n"}),
                new String[]{"", "\n", "123", "asdfghjk"});
    }

    @Test
    public void testGetAverageLengthOfStrings() {
        assertEquals(HomeworkTen.getAverageLengthOfStrings(new String[]{"123", "", "asdfghfjk", "\n"}), 3.25);
        assertEquals(HomeworkTen.getAverageLengthOfStrings(new String[]{""}), 0);
    }

    @Test
    public void testIsConsistOfUniqueChars() {
        assertFalse(HomeworkTen.isConsistOfUniqueChars("Hello"));
        assertTrue(HomeworkTen.isConsistOfUniqueChars("Equals"));

    }

    @Test
    public void testGetWordWithUniqueChars() {
        assertEquals(HomeworkTen.getWordWithUniqueChars(new String[]{"Hello", "Java", "World", "Cat"}), "World");
        assertEquals(HomeworkTen.getWordWithUniqueChars(new String[]{"HeLlo", "Java", "World", "Cat"}), "HeLlo");
        assertEquals(HomeworkTen.getWordWithUniqueChars(new String[]{"Hello", "Java", "WorldW", "CatC"}), "");

    }

    @Test
    public void testGetStringWithDuplicatedChars() {
        assertEquals(HomeworkTen.getStringWithDuplicatedChars("Hello"), "HHeelllloo");
        assertEquals(HomeworkTen.getStringWithDuplicatedChars(""), "");
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(HomeworkTen.isPalindrome("noon"));
        assertTrue(HomeworkTen.isPalindrome("rotator"));
        assertFalse(HomeworkTen.isPalindrome("animal"));
    }

    @Test
    public void testGetWordsFromString() {
        assertEquals(HomeworkTen.getWordsFromString(""),
                new String[]{""});
        assertEquals(HomeworkTen.getWordsFromString(" "),
                new String[]{" "});
        assertEquals(HomeworkTen.getWordsFromString("\n"),
                new String[]{"\n"});
        assertEquals(HomeworkTen.getWordsFromString("\n\n"),
                new String[]{"\n", "\n"});
        assertEquals(HomeworkTen.getWordsFromString("ab"),
                new String[]{"ab"});
        assertEquals(HomeworkTen.getWordsFromString("ab\n"),
                new String[]{"ab\n"});
        assertEquals(HomeworkTen.getWordsFromString("\nab"),
                new String[]{"\n", "ab"});
        assertEquals(HomeworkTen.getWordsFromString("\nab\n"),
                new String[]{"\n", "ab\n"});
        assertEquals(HomeworkTen.getWordsFromString("ab\ncd"),
                new String[]{"ab\n", "cd"});
        assertEquals(HomeworkTen.getWordsFromString("ab\n\ncd"),
                new String[]{"ab\n", "\n", "cd"});
    }

    @Test
    public void testAddWordToStringsArray(){
        assertEquals(HomeworkTen.addWordToStringsArray(new String[0], "Cat"), new String[] {"Cat"});
        assertEquals(HomeworkTen.addWordToStringsArray(new String[]{"One", "Two", "Three"}, "Ten"),
                new String[]{"One", "Two", "Three", "Ten"});
    }
}