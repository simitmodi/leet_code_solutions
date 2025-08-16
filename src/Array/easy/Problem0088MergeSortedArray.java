package Array.easy;

import java.util.Arrays;

public class Problem0088MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m != 0 && n != 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }
        while (m != 0) {
            nums1[m + n - 1] = nums1[m - 1];
            m--;
        }
        while (n != 0) {
            nums1[m + n - 1] = nums2[n - 1];
            n--;
        }
    }

    public static void main(String[] args) {
        Problem0088MergeSortedArray solution = new Problem0088MergeSortedArray();

        int[] nums1_1 = {1,2,3,0,0,0}; int m1 = 3; int[] nums2_1 = {2,5,6}; int n1 = 3;
        int[] copy1 = Arrays.copyOf(nums1_1, nums1_1.length);
        solution.merge(copy1, m1, nums2_1, n1);
        System.out.println("nums1 = " + Arrays.toString(nums1_1) + ", m = " + m1 + ", nums2 = " + Arrays.toString(nums2_1) + ", n = " + n1 + " -> output = " + Arrays.toString(copy1));

        int[] nums1_2 = {1}; int m2 = 1; int[] nums2_2 = {}; int n2 = 0;
        int[] copy2 = Arrays.copyOf(nums1_2, nums1_2.length);
        solution.merge(copy2, m2, nums2_2, n2);
        System.out.println("nums1 = " + Arrays.toString(nums1_2) + ", m = " + m2 + ", nums2 = " + Arrays.toString(nums2_2) + ", n = " + n2 + " -> output = " + Arrays.toString(copy2));

        int[] nums1_3 = {0}; int m3 = 0; int[] nums2_3 = {1}; int n3 = 1;
        int[] copy3 = Arrays.copyOf(nums1_3, nums1_3.length);
        solution.merge(copy3, m3, nums2_3, n3);
        System.out.println("nums1 = " + Arrays.toString(nums1_3) + ", m = " + m3 + ", nums2 = " + Arrays.toString(nums2_3) + ", n = " + n3 + " -> output = " + Arrays.toString(copy3));

        int[] nums1_4 = {4,5,6,0,0,0}; int m4 = 3; int[] nums2_4 = {1,2,3}; int n4 = 3;
        int[] copy4 = Arrays.copyOf(nums1_4, nums1_4.length);
        solution.merge(copy4, m4, nums2_4, n4);
        System.out.println("nums1 = " + Arrays.toString(nums1_4) + ", m = " + m4 + ", nums2 = " + Arrays.toString(nums2_4) + ", n = " + n4 + " -> output = " + Arrays.toString(copy4));

        int[] nums1_5 = {1,3,5,0,0,0}; int m5 = 3; int[] nums2_5 = {2,4,6}; int n5 = 3;
        int[] copy5 = Arrays.copyOf(nums1_5, nums1_5.length);
        solution.merge(copy5, m5, nums2_5, n5);
        System.out.println("nums1 = " + Arrays.toString(nums1_5) + ", m = " + m5 + ", nums2 = " + Arrays.toString(nums2_5) + ", n = " + n5 + " -> output = " + Arrays.toString(copy5));

        int[] nums1_6 = new int[200000];
        int m6 = 100000;
        int[] nums2_6 = new int[123456];
        int n6 = 100000;
        for (int i = 0; i < 100000; i++) {
            nums1_6[i] = i * 2;
            nums2_6[i] = i * 2 + 1;
        }
        int[] copy6 = Arrays.copyOf(nums1_6, nums1_6.length);
        solution.merge(copy6, m6, nums2_6, n6);
        System.out.println("nums1 = large array, m = 100000, nums2 = large array, n = 100000 -> output length = " + copy6.length);
    }
}