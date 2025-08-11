package Array.easy;

import java.util.Arrays;

public class Problem0066PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        Problem0066PlusOne solution = new Problem0066PlusOne();

        int[] d1 = {1,2,3};
        System.out.println("digits = " + Arrays.toString(d1) + " -> output = " + Arrays.toString(solution.plusOne(Arrays.copyOf(d1, d1.length))));

        int[] d2 = {4,3,2,1};
        System.out.println("digits = " + Arrays.toString(d2) + " -> output = " + Arrays.toString(solution.plusOne(Arrays.copyOf(d2, d2.length))));

        int[] d3 = {9};
        System.out.println("digits = " + Arrays.toString(d3) + " -> output = " + Arrays.toString(solution.plusOne(Arrays.copyOf(d3, d3.length))));

        int[] d4 = {9,9,9,9};
        System.out.println("digits = " + Arrays.toString(d4) + " -> output = " + Arrays.toString(solution.plusOne(Arrays.copyOf(d4, d4.length))));

        int[] d5 = {0};
        System.out.println("digits = " + Arrays.toString(d5) + " -> output = " + Arrays.toString(solution.plusOne(Arrays.copyOf(d5, d5.length))));

        int[] d6 = {};
        System.out.println("digits = " + Arrays.toString(d6) + " -> output = " + Arrays.toString(solution.plusOne(Arrays.copyOf(d6, d6.length))));

        int[] d7 = new int[100000];
        for (int i = 0; i < d7.length; i++) d7[i] = 9;
        int[] r7 = solution.plusOne(Arrays.copyOf(d7, d7.length));
        System.out.println("digits = large array of 9s, size = " + d7.length + " -> output length = " + r7.length + ", first two = [" + r7[0] + ", " + r7[1] + "]");
    }
}
