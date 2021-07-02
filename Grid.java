public class Grid {
    public static int[][] InitializeGrid(int y, int x) {
        int[][] grid = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        return grid;
    }
}
