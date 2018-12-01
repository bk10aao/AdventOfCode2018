import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayOneTest {

    private DayOne dayOne;

    @Before
    public void setup() {
        this.dayOne = new DayOne();
    }

    @Test
    public void givenInput_returnOne() {
        String[] input = new String[] {"+1"};
        assertEquals(1, dayOne.getFrequency(input));
    }

    @Test
    public void givenInput_returnMinusOne() {
        String[] input = new String[] {"+1", "-2"};
        assertEquals(-1, dayOne.getFrequency(input));
    }

    @Test
    public void givenInput_returnTwo() {
        String[] input = new String[] {"+1", "-2", "+3"};
        assertEquals(2, dayOne.getFrequency(input));
    }

    @Test
    public void givenInput_returnThree() {
        String input[] = new String[] {"+1", "-2", "+3", "+1"};
        assertEquals(3, dayOne.getFrequency(input));
    }

    @Test
    public void givenSecondInput_returnThree() {
        String[] input = "+1, +1, +1".split(", ");
        assertEquals(3, dayOne.getFrequency(input));
    }

    @Test
    public void givenInput_returnZero() {
        String[] input = "+1, +1, -2".split(", ");
        assertEquals(0, dayOne.getFrequency(input));
    }

    @Test
    public void givenInput_returnMinusSix() {
        String[] input = "-1, -2, -3".split(", ");
        assertEquals(-6, dayOne.getFrequency(input));
    }

    @Test
    public void givenInput_reachesFrequencyZeroTwice() {
        String[] input = "+1, -1".split(", ");
        assertEquals(0, dayOne.getValueOfSecondExperiencedValue(input));
    }

    @Test
    public void givenInput_reachesFrequencyTenTwice() {
        String[] input = "+3, +3, +4, -2, -4".split(", ");
        assertEquals(10, dayOne.getValueOfSecondExperiencedValue(input));
    }

    @Test
    public void givenInput_reachesFrequencyFiveTwice() {
        String[] input = "-6, +3, +8, +5, -6".split(", ");
        assertEquals(5, dayOne.getValueOfSecondExperiencedValue(input));
    }

    @Test
    public void givenInput_reachesFrequencyFourteenTwice() {
        String[] input = "+7, +7, -2, -7, -4".split(", ");
        assertEquals(14, dayOne.getValueOfSecondExperiencedValue(input));
    }
}