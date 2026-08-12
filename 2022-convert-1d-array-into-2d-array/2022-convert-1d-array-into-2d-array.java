class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // 1. Check if the elements can fit exactly into an m x n matrix
        if (original.length != m * n) {
            return new int[0][0];
        }

        // 2. Initialize the result array
        int[][] result = new int[m][n];

        // 3. Fill the 2D array row by row
        int index = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                result[r][c] = original[index++];
            }
        }

        return result;
    }
}