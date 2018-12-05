import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayTwoTest {

    private DayTwo dayTwo = new DayTwo();

    @Before
    public void setup() {
        this.dayTwo = new DayTwo();
    }

    @Test
    public void givenInput_abcdef_returnsScoreOfZero() {
        int result = dayTwo.getScore("abcdef");
        assertEquals(0, result);
    }

    @Test
    public void givenInput_bababc_returnsScoreOfOne() {
        int result = dayTwo.getScore("bababc");
        assertEquals(1, result);
    }

    @Test
    public void givenInput_abcccd_returnsScoreOfOne() {
        int result = dayTwo.getScore("abcccd");
        assertEquals(1, result);
    }

    @Test
    public void givenInput_aabcdd_returnsScoreOfOne() {
        int result = dayTwo.getScore("aabcdd");
        assertEquals(1, result);
    }

    @Test
    public void givenInput_abcdee_returnsScoreOfOne() {
        int result = dayTwo.getScore("abcdee");
        assertEquals(1, result);
    }

    @Test
    public void givenInput_ababab_returnsScoreOfOne() {
        int result = dayTwo.getScore("ababab");
        assertEquals(1, result);
    }

    @Test
    public void givenAllInputs_returnScoreOfTwelve() {
        String input =  "abcdef\n" +
                        "bababc\n" +
                        "abbcde\n" +
                        "abcccd\n" +
                        "aabcdd\n" +
                        "abcdee\n" +
                        "ababab";
        int result = dayTwo.getScore(input);
        assertEquals(12, result);
    }
}