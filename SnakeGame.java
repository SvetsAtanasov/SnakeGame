import java.util.Arrays;
import java.util.Timer;

public class SnakeGame {

    public static void main(String[] args) {
        int gridSizeX = 10;
        int gridSizeY = 10;

        Snake snake = new Snake();

        int[][] grid = Grid.InitializeGrid(gridSizeY, gridSizeX);
        int snakeBody = snake.body;
        grid[0][0] = snakeBody;

        int[] vector = IndexOf(gridSizeY, gridSizeX, snakeBody, grid, 2);
        int xPos = vector[0];
        int yPos = vector[1];

        System.out.println();
        grid[yPos][xPos] = snakeBody;

        for (int i = 0; i < gridSizeY; i++) {
            for (int j = 0; j < gridSizeX; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(xPos);
        System.out.println(yPos);

        System.out.println(Arrays.toString(vector));

        CustomTimer();
    }

    public static int[] IndexOf(int y, int x, int object, int[][] grid, int size) {
        int[] vector = new int[size];
        int posX = 0;
        int posY = 1;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (grid[i][j] == object) {
                    vector[posX] = j;
                    vector[posY] = i;
                }
            }
        }
        return vector;
    }

    public static void CustomTimer() {
        int elapsedTime = 0;
        int seconds = 0;
        int minutes = 0;

        String secondsStr = String.format("%02d", seconds);
        String minutesStr = String.format("%02d", minutes);

        for (int i = 0; i < 1000; i++) {
            elapsedTime += 1000;
            seconds = (elapsedTime / 1000);
            minutes = (elapsedTime / 60000);

            secondsStr = (String.format("%02d", seconds / 10000) + "Seconds");
            minutesStr = (String.format("%02d", minutes / 10000) + "Minutes");

            System.out.println(minutesStr + secondsStr);

            i = 0;
        }
    }
}