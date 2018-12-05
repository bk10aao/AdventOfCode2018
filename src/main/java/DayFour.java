import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DayFour {

    private String[] shiftPatterns;

    private HashMap<Integer, Gaurd> gaurds = new HashMap<Integer, Gaurd>();

    public void setUp(final String input) {
        shiftPatterns = input.split("\n");
        Arrays.sort(shiftPatterns);
        for(String line : shiftPatterns) {
            System.out.println(line);
            String[] lineValues = line.split(" ");
            if(!lineValues[2].equalsIgnoreCase("wakes") &&
                !lineValues[2].equalsIgnoreCase("falls") &&
                !lineValues[2].equalsIgnoreCase("asleep")) {
                int gaurdNumber = Integer.parseInt(lineValues[3].replace("#", ""));
                if (!gaurds.containsKey(gaurdNumber)) {
                    gaurds.put(gaurdNumber, new Gaurd());
                }
            }
        }
        System.out.println(" ");
    }




    private class Gaurd {
        private int timeSlept;

        public void incrementTimeSleptByAmount(final int sleepTime) {
            this.timeSlept += sleepTime;
        }

    }
}
