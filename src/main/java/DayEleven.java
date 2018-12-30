import java.util.Arrays;
import java.util.stream.IntStream;

public class DayEleven {

    private int grid[][] = new int[300][300];

    public void setup(int serialNumber) {
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid.length; y++) {
                int powerLevel = ((((x + 1) + 10) * (y + 1)) + serialNumber) * ((x + 1) + 10);
                char[] c = String.valueOf(powerLevel).toCharArray();
                grid[x][y] = Integer.parseInt(String.valueOf(c[c.length - 3])) - 5;
            }
        }
    }

    public int getFuelCellValue(int x, int y) {
        return grid[x - 1][y - 1];
    }

    public String getHighestFuelCellGrid() {
        int highestFuelCellValue = Integer.MIN_VALUE;
        String coordinateValue = "";
        for(int x = 1; x < grid.length - 1; x++) {
            for (int y = 1; y < grid.length - 1; y++) {
                int aboveValue = IntStream.of(Arrays.copyOfRange(grid[x - 1], y - 1, y + 2)).sum();
                int middleValue = IntStream.of(Arrays.copyOfRange(grid[x], y - 1, y + 2)).sum();
                int belowValue = IntStream.of(Arrays.copyOfRange(grid[x + 1], y - 1, y + 2)).sum();
                int squareTotal = aboveValue + middleValue + belowValue;
                if (squareTotal > highestFuelCellValue) {
                    highestFuelCellValue = squareTotal;
                    coordinateValue = x + "," + y;
                }
            }
        }
        return coordinateValue;
    }

    public static void main(String[] args) {
        DayEleven dayEleven = new DayEleven();
        dayEleven.setup(9798);
        System.out.println(dayEleven.getHighestFuelCellGrid());
    }

    public String toString() {
        String gridLayout = "";
        for(int[] i : grid) {
            gridLayout += Arrays.toString(i).replace("[","").replace("]", "\n");
        }
        return gridLayout;
    }
}