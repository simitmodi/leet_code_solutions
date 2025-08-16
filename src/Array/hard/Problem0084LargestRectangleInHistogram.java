package Array.hard;

import java.util.Arrays;

public class Problem0084LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) return 0;
        int[] left  = new int[n];
        int[] right = new int[n];
        left[0] = -1;
        for (int i = 1; i < n; i++) {
            int p = i - 1;
            while (p != -1 && heights[p] >= heights[i])
                p = left[p];
            left[i] = p;
        }
        right[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            int p = i + 1;
            while (p != n && heights[p] >= heights[i])
                p = right[p];
            right[i] = p;
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            maxArea = Math.max(maxArea, width * heights[i]);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Problem0084LargestRectangleInHistogram solution = new Problem0084LargestRectangleInHistogram();

        int[] heights1 = {2,1,5,6,2,3};
        System.out.println("heights = " + Arrays.toString(heights1) + " -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights1, heights1.length)));

        int[] heights2 = {2,4};
        System.out.println("heights = " + Arrays.toString(heights2) + " -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights2, heights2.length)));

        int[] heights3 = {};
        System.out.println("heights = " + Arrays.toString(heights3) + " -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights3, heights3.length)));

        int[] heights4 = {1};
        System.out.println("heights = " + Arrays.toString(heights4) + " -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights4, heights4.length)));

        int[] heights5 = {6,7,5,2,4,5,9,3};
        System.out.println("heights = " + Arrays.toString(heights5) + " -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights5, heights5.length)));

        int[] heights6 = {1,1,1,1,1};
        System.out.println("heights = " + Arrays.toString(heights6) + " -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights6, heights6.length)));

        int[] heights7 = {5,4,3,2,1};
        System.out.println("heights = " + Arrays.toString(heights7) + " -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights7, heights7.length)));

        int[] heights8 = {1,2,3,4,5};
        System.out.println("heights = " + Arrays.toString(heights8) + " -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights8, heights8.length)));

        int[] heights9 = new int[100000];
        for (int i = 0; i < heights9.length; i++) heights9[i] = 1000;
        System.out.println("heights = large array, size = 100000 -> output = " + solution.largestRectangleArea(Arrays.copyOf(heights9, heights9.length)));
    }
}