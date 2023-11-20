package homework;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class HomeworkFifteenTest {
    private final double USD_RATE = 3.2;

    @Test
    public void testGetHundredthBirthday() {
        assertEquals(HomeworkFifteen.getHundredthBirthday("2000-01-01"), LocalDate.of(2100, 1, 1));
    }

    @Test
    public void testGetPositiveNumbers() {
        assertEquals(HomeworkFifteen.getPositiveNumbers(new ArrayList<>(List.of())), new ArrayList<>(List.of()));
        assertEquals(HomeworkFifteen.getPositiveNumbers(new ArrayList<>(List.of(-1, -4, -2, -22))), new ArrayList<>(List.of()));
        assertEquals(HomeworkFifteen.getPositiveNumbers(new ArrayList<>(List.of(-1, 3, 0, -22, 48, -4, 12))), new ArrayList<>(List.of(3, 48, 12)));
    }

    @Test
    public void testConvertFromBYNToUSDFunction() {
        assertEquals(HomeworkFifteen.convertFromBYNToUSDFunction("0 BYN", USD_RATE), 0/USD_RATE + " USD");
        assertEquals(HomeworkFifteen.convertFromBYNToUSDFunction("915 BYN", USD_RATE), 915/USD_RATE + " USD");
    }

    @Test
    public void testConvertFromBYNToUSDConsumer() {
        assertEquals(HomeworkFifteen.convertFromBYNToUSDConsumer("0 BYN", USD_RATE), 0/USD_RATE + " USD");
        assertEquals(HomeworkFifteen.convertFromBYNToUSDConsumer("915 BYN", USD_RATE), 915/USD_RATE + " USD");
    }

    @Test
    public void testGetMirrorString() {
        assertEquals(HomeworkFifteen.getMirrorString(""), "");
        assertEquals(HomeworkFifteen.getMirrorString("qwerty"), "ytrewq");
        assertEquals(HomeworkFifteen.getMirrorString("город дорог"), "город дорог");
    }
}