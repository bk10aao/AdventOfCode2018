import org.junit.Test;

import static org.junit.Assert.*;

public class DayElevenTest {

    @Test
    public void thePowerLevelOfFuelCell_3_5_withGridSerialNumberOf_8_returns_4() {
        DayEleven dayEleven = new DayEleven();
        dayEleven.setup(8);
        int result = dayEleven.getFuelCellValue(3, 5);
        assertEquals(4, result);
    }

    @Test
    public void thePowerLevelOfFuelCell_127_79_withGridSerialNumberOf_57_returns_MinusFive() {
        DayEleven dayEleven = new DayEleven();
        dayEleven.setup(57);
        int result = dayEleven.getFuelCellValue(122, 79);
        assertEquals(-5, result);
    }

    @Test
    public void thePowerLevelOfFuelCell_217_196_withGridSerialNumberOf_39_returns_0() {
        DayEleven dayEleven = new DayEleven();
        dayEleven.setup(39);
        int result = dayEleven.getFuelCellValue(217, 196);
        assertEquals(0, result);
    }

    @Test
    public void thePowerLevelOfFuelCell_101_153_withGridSerialNumberOf_371_returns_4() {
        DayEleven dayEleven = new DayEleven();
        dayEleven.setup(71);
        int result = dayEleven.getFuelCellValue(101, 153);
        assertEquals(4, result);
    }

    @Test
    public void theHighestSquareValue_withSerialNumber_42_returns_30() {
        DayEleven dayEleven = new DayEleven();
        dayEleven.setup(42);
        String result = dayEleven.getHighestFuelCellGrid();
        assertEquals("21,61", result);
    }

    @Test
    public void theHighestSquareValue_withSerialNumber_18_returns_29() {
        DayEleven dayEleven = new DayEleven();
        dayEleven.setup(18);
        String result = dayEleven.getHighestFuelCellGrid();
        assertEquals("33,45", result);
    }
}