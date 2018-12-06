import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayFourTest {
    private DayFour dayFour;

    @Before
    public void setup() {
      this.dayFour = new DayFour();
        String input =  "[1518-11-01 00:00] Guard #10 begins shift\n" +
                "[1518-11-01 00:05] falls asleep\n" +
                "[1518-11-01 00:25] wakes up\n" +
                "[1518-11-01 00:30] falls asleep\n" +
                "[1518-11-01 00:55] wakes up\n" +
                "[1518-11-01 23:58] Guard #99 begins shift\n" +
                "[1518-11-02 00:40] falls asleep\n" +
                "[1518-11-02 00:50] wakes up\n" +
                "[1518-11-03 00:05] Guard #10 begins shift\n" +
                "[1518-11-03 00:24] falls asleep\n" +
                "[1518-11-03 00:29] wakes up\n" +
                "[1518-11-04 00:02] Guard #99 begins shift\n" +
                "[1518-11-04 00:36] falls asleep\n" +
                "[1518-11-04 00:46] wakes up\n" +
                "[1518-11-05 00:03] Guard #99 begins shift\n" +
                "[1518-11-05 00:45] falls asleep\n" +
                "[1518-11-05 00:55] wakes up";
        dayFour.setUp(input);
    }


    @Test
    public void givenInput_gaurdTenSpendsFiftyMinutesAsleep() {
        dayFour.calculateSleepTime();
        int gaurdOneSleepTime = dayFour.getGaurdsSleepCount(10);
        assertEquals(50, gaurdOneSleepTime);
    }

    @Test
    public void givenInput_gaurdNinetyNineSpendsThirtyMinutesAsleep() {
        dayFour.calculateSleepTime();
        int gaurdTwoSleepTime = dayFour.getGaurdsSleepCount(99);
        assertEquals(30, gaurdTwoSleepTime);
    }

    @Test
    public void givenInput_gaurdNinetyNineSleep240Minutes() {
        int result = dayFour.calculateSleepTime();
        assertEquals(240, result);
    }
}