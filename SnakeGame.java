import java.util.Arrays;

public class SnakeGame {

    public static void main(String[] args) {
        int gridSizeX = 10;
        int gridSizeY = 10;

        Snake snake = new Snake();

        int[][] grid = InitializeGrid(gridSizeY, gridSizeX);
        grid[5][9] = snake.body;

        int[] vector = IndexOf(gridSizeY, gridSizeX, snake.body, grid, 2);
        System.out.println(Arrays.toString(vector));
    }

    public static int[] IndexOf(int x, int y, int object, int[][] grid, int dimension) {
        int[] vector = new int[dimension];
        int posY = 0;
        int posX = 1;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (object >= 0 && object < x * y) {
                    if (grid[i][j] == object) {
                        vector[posY] = i;
                        vector[posX] = j;
                    }
                }
            }
        }
        return vector;
    }

    public static int[][] InitializeGrid(int x, int y) {
        int[][] grid = new int[x][y];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        return grid;
    }
}