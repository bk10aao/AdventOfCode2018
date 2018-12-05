import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayFiveTest {

    private DayFive dayFive;

    @Before
    public void setup() {
        this.dayFive = new DayFive();
    }

    @Test
    public void givenInput_aA_returnsEmptyString() {
        int result = dayFive.getReactionResult("aA");
        assertEquals(0, result);
    }

    @Test
    public void givenInput_abBA_returnsEmptyString() {
        int result = dayFive.getReactionResult("abBA");
        assertEquals(0, result);
    }

    @Test
    public void givenInput_abAB_returnsFour() {
        int result = dayFive.getReactionResult("abAB");
        assertEquals(4, result);
    }

    @Test
    public void givenInput_aabAAB_returnsSix() {
        int result = dayFive.getReactionResult("aabAAB");
        assertEquals(6, result);
    }

    @Test
    public void givenInput_dabAcCaCBAcCcaDA_returnsTen() {
        int result = dayFive.getReactionResult("dabAcCaCBAcCcaDA");
        assertEquals(10, result);
    }

    @Test
    public void givenInput_dabAcCaCBAcCcaDA_rerturnsFour() {
        int result = dayFive.getShortestSingleCollapse("dabAcCaCBAcCcaDA");
        assertEquals(4, result);
    }
}