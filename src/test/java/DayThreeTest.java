import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayThreeTest {

    private DayThree dayThree = new DayThree();

    @Before
    public void setup() {
        this.dayThree = new DayThree();
    }

    @Test
    public void givenInput_returnsNoOverlappingPatches() {
        String input =  "#1 @ 1,3: 4x4\n" +
                        "#2 @ 3,1: 4x4\n" +
                        "#3 @ 5,5: 2x2";
        dayThree.setupFabric(20, 20);
        int result = dayThree.getOverlappedCount(input);
        assertEquals(4, result);
    }

    @Test
    public void givenInput_returnsSquareThreeAsUntouched() {
        String input =  "#1 @ 1,3: 4x4\n" +
                "#2 @ 3,1: 4x4\n" +
                "#3 @ 5,5: 2x2";
        dayThree.setupFabric(20, 20);
        dayThree.getOverlappedCount(input);
        int result = dayThree.getCompleteSquare();
        assertEquals(3, result);
    }

}