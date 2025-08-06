package Array.hard;

import java.util.Arrays;

/**
 * LeetCode Problem: 4 - Median of Two Sorted Arrays
 * Difficulty: Hard
 *
 * Problem: Given two sorted arrays nums1 and nums2, return the median.
 *
 * Time Complexity: O((m+n) log(m+n)) - due to merging
 * Space Complexity: O(m+n) - for merged array
 *
 * @author Simit Modi
 * @date August 2025
 */
public class Problem0004MedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer;
        int[] ans = mergeArray(nums1, nums2);
        if (ans.length % 2 == 0) {
            double mid1 = ans[(ans.length / 2) - 1];
            double mid2 = ans[(ans.length / 2)];
            answer = (mid1 + mid2) / 2.0;
        } else {
            answer = ans[ans.length / 2];
        }
        return answer;
    }

    public static int[] mergeArray(int[] numArr1, int[] numArr2) {
        int newSize = numArr1.length + numArr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;

        while (i < numArr1.length || j < numArr2.length) {
            if (j == numArr2.length ||
                    (i < numArr1.length && numArr1[i] < numArr2[j])) {
                newArr[k] = numArr1[i];
                i++;
                k++;
            } else {
                newArr[k] = numArr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Problem0004MedianSortedArrays solution = new Problem0004MedianSortedArrays();

        // Test Case 1: Example from LeetCode
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result1 = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Test 1:");
        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));
        System.out.println("Median: " + result1);
        System.out.println();

        // Test Case 2: Even length merged array
        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        double result2 = solution.findMedianSortedArrays(nums1_2, nums2_2);
        System.out.println("Test 2:");
        System.out.println("nums1: " + Arrays.toString(nums1_2));
        System.out.println("nums2: " + Arrays.toString(nums2_2));
        System.out.println("Median: " + result2);
        System.out.println();

        // Test Case 3: One empty array
        int[] nums1_3 = {};
        int[] nums2_3 = {1};
        double result3 = solution.findMedianSortedArrays(nums1_3, nums2_3);
        System.out.println("Test 3:");
        System.out.println("nums1: " + Arrays.toString(nums1_3));
        System.out.println("nums2: " + Arrays.toString(nums2_3));
        System.out.println("Median: " + result3);
    }
}