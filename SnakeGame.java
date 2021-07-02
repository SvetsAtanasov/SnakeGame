import java.awt.event.KeyEvent;
import java.io.Console;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SnakeGame {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        int[][] grid = InitializeGrid(x, y);
        grid[5][9] = 1;

        int[] vector = IndexOf(x, y, 1, grid, 2);
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