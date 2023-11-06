package homework.homework14;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class MyArrayListTest {

    private final MyArrayList<String> stringList = new MyArrayList<>();

    @BeforeTest
    public void initialize() {
        for (int i = 0; i < 50; i++) {
            stringList.add("" + i);
        }
    }

    @Test
    public void testAdd() {
        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);
        stringList.add("testAdd");
        assertEquals(stringList.size(), 51);
        assertEquals(stringList.get(49), "49");
        assertEquals(stringList.get(50), "testAdd");
    }

    @Test
    public void testAddByIndex() {
        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);

        stringList.add(0, "Add to 0");
        assertEquals(stringList.size(), 51);
        assertEquals(stringList.get(0), "Add to 0");
        assertEquals(stringList.get(1), "0");
        assertEquals(stringList.get(50), "49");

        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);
        stringList.add(stringList.size(), "Add to end");
        assertEquals(stringList.size(), 51);
        assertEquals(stringList.get(50), "Add to end");
        assertEquals(stringList.get(49), "49");

        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);
        stringList.add(25, "Add to 25");
        assertEquals(stringList.size(), 51);
        assertEquals(stringList.get(0), "0");
        assertEquals(stringList.get(24), "24");
        assertEquals(stringList.get(25), "Add to 25");
        assertEquals(stringList.get(26), "25");
        assertEquals(stringList.get(50), "49");
    }

    @Test
    public void testGet() {
        stringList.clear();
        initialize();
        for (int i = 0; i < stringList.size(); i++) {
            assertEquals(stringList.get(i), "" + i);
        }
    }

    @Test
    public void testIndexOf() {
        stringList.clear();
        initialize();
        for (int i = 0; i < stringList.size(); i++) {
            assertEquals(stringList.indexOf("" + i), i);
        }
        assertEquals(stringList.indexOf("50"), -1);
        assertEquals(stringList.indexOf(23), -1);
    }

    @Test
    public void testContains() {
        stringList.clear();
        initialize();
        for (int i = 0; i < stringList.size(); i++) {
            assertTrue(stringList.contains("" + i));
        }

        assertFalse(stringList.contains("50"));
        assertFalse(stringList.contains(23));
    }

    @Test
    public void testRemove() {
        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);

        stringList.remove(0);
        assertEquals(stringList.size(), 49);
        assertEquals(stringList.get(0), "1");
        assertEquals(stringList.get(1), "2");
        assertEquals(stringList.get(48), "49");

        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);
        stringList.remove(stringList.size() - 1);
        assertEquals(stringList.size(), 49);
        assertEquals(stringList.get(0), "0");
        assertEquals(stringList.get(47),"47");
        assertEquals(stringList.get(48), "48");

        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);
        stringList.remove(25);
        assertEquals(stringList.size(), 49);
        assertEquals(stringList.get(0), "0");
        assertEquals(stringList.get(24), "24");
        assertEquals(stringList.get(25), "26");
        assertEquals(stringList.get(26), "27");
        assertEquals(stringList.get(48), "49");
    }

    @Test
    public void testRemoveByObject() {
        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);

        assertTrue(stringList.remove("0"));
        assertEquals(stringList.size(), 49);
        assertEquals(stringList.get(0), "1");
        assertEquals(stringList.get(1), "2");
        assertEquals(stringList.get(48), "49");

        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);
        assertTrue(stringList.remove("49"));
        assertEquals(stringList.size(), 49);
        assertEquals(stringList.get(0), "0");
        assertEquals(stringList.get(47),"47");
        assertEquals(stringList.get(48), "48");

        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);
        assertTrue(stringList.remove("25"));
        assertEquals(stringList.size(), 49);
        assertEquals(stringList.get(0), "0");
        assertEquals(stringList.get(24), "24");
        assertEquals(stringList.get(25), "26");
        assertEquals(stringList.get(26), "27");
        assertEquals(stringList.get(48), "49");

        assertFalse(stringList.remove("100"));
    }

    @Test
    public void testClear() {
        stringList.clear();
        initialize();
        assertEquals(stringList.size(), 50);
        stringList.clear();
        assertEquals(stringList.size(), 0);
    }
}