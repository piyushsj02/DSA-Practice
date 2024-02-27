
// LeetCode - 73


class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // Variables to keep track of rows and columns to be zeroed out
        boolean zeroFirstRow = false;
        boolean zeroFirstCol = false;

        // Mark rows and columns that need to be zeroed out
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    if (i == 0) zeroFirstRow = true;
                    if (j == 0) zeroFirstCol = true;
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Set elements to zero based on marked rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // Zero out first row if necessary
        if (zeroFirstRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Zero out first column if necessary
        if (zeroFirstCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
