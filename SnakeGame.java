import java.util.Arrays;

public class SnakeGame {

    public static void main(String[] args) {
        int gridSizeX = 5;
        int gridSizeY = 10;

        Snake snake = new Snake();

        int[][] grid = Grid.InitializeGrid(gridSizeY, gridSizeX);
        int snakeBody = snake.body;
        grid[7][3] = snakeBody;

        int[] vector = IndexOf(gridSizeY, gridSizeX, snakeBody, grid, 2);
        int xPos = vector[0];
        int yPos = vector[1];

        System.out.println(xPos);
        System.out.println(yPos);

        System.out.println(Arrays.toString(vector));
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
}