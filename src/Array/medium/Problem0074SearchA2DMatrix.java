package Array.medium;

import java.util.Arrays;

public class Problem0074SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        while (i < matrix.length) {
            int j = 0;
            while (j < matrix[i].length) {
                if (matrix[i][j] == target) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Problem0074SearchA2DMatrix solution = new Problem0074SearchA2DMatrix();

        int[][] m1 = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int t1 = 3;
        System.out.println("matrix = " + Arrays.deepToString(m1) + ", target = " + t1 + " -> output = " + solution.searchMatrix(m1, t1));

        int[][] m2 = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int t2 = 13;
        System.out.println("matrix = " + Arrays.deepToString(m2) + ", target = " + t2 + " -> output = " + solution.searchMatrix(m2, t2));

        int[][] m3 = {{1}};
        int t3 = 1;
        System.out.println("matrix = " + Arrays.deepToString(m3) + ", target = " + t3 + " -> output = " + solution.searchMatrix(m3, t3));

        int[][] m4 = {{1}};
        int t4 = 0;
        System.out.println("matrix = " + Arrays.deepToString(m4) + ", target = " + t4 + " -> output = " + solution.searchMatrix(m4, t4));

        int[][] m5 = {};
        int t5 = 1;
        System.out.println("matrix = " + Arrays.deepToString(m5) + ", target = " + t5 + " -> output = " + solution.searchMatrix(m5, t5));

        int[][] m6 = {{}};
        int t6 = 1;
        System.out.println("matrix = " + Arrays.deepToString(m6) + ", target = " + t6 + " -> output = " + solution.searchMatrix(m6, t6));

        int rows = 300, cols = 300;
        int[][] m7 = new int[rows][cols];
        int val = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                m7[r][c] = val++;
            }
        }
        int t7 = rows * cols;
        System.out.println("matrix = large " + rows + "x" + cols + ", target = " + t7 + " -> output = " + solution.searchMatrix(m7, t7));

        int t8 = rows * cols + 1;
        System.out.println("matrix = large " + rows + "x" + cols + ", target = " + t8 + " -> output = " + solution.searchMatrix(m7, t8));
    }
}