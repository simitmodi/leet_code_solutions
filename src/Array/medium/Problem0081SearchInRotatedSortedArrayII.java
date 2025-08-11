package Array.medium;

import java.util.Arrays;

public class Problem0081SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        boolean found = false;
        for (int num : nums) {
            if (num == target) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Problem0081SearchInRotatedSortedArrayII solution = new Problem0081SearchInRotatedSortedArrayII();

        int[] nums1 = {2,5,6,0,0,1,2}; int target1 = 0;
        System.out.println("nums = " + Arrays.toString(nums1) + ", target = " + target1 + " -> output = " + solution.search(Arrays.copyOf(nums1, nums1.length), target1));

        int[] nums2 = {2,5,6,0,0,1,2}; int target2 = 3;
        System.out.println("nums = " + Arrays.toString(nums2) + ", target = " + target2 + " -> output = " + solution.search(Arrays.copyOf(nums2, nums2.length), target2));

        int[] nums3 = {1,0,1,1,1}; int target3 = 0;
        System.out.println("nums = " + Arrays.toString(nums3) + ", target = " + target3 + " -> output = " + solution.search(Arrays.copyOf(nums3, nums3.length), target3));

        int[] nums4 = {1,1,1,1,1}; int target4 = 1;
        System.out.println("nums = " + Arrays.toString(nums4) + ", target = " + target4 + " -> output = " + solution.search(Arrays.copyOf(nums4, nums4.length), target4));

        int[] nums5 = {1,1,1,1,1}; int target5 = 2;
        System.out.println("nums = " + Arrays.toString(nums5) + ", target = " + target5 + " -> output = " + solution.search(Arrays.copyOf(nums5, nums5.length), target5));

        int[] nums6 = {}; int target6 = 1;
        System.out.println("nums = " + Arrays.toString(nums6) + ", target = " + target6 + " -> output = " + solution.search(Arrays.copyOf(nums6, nums6.length), target6));

        int[] nums7 = {1}; int target7 = 1;
        System.out.println("nums = " + Arrays.toString(nums7) + ", target = " + target7 + " -> output = " + solution.search(Arrays.copyOf(nums7, nums7.length), target7));

        int[] nums8 = {1}; int target8 = 0;
        System.out.println("nums = " + Arrays.toString(nums8) + ", target = " + target8 + " -> output = " + solution.search(Arrays.copyOf(nums8, nums8.length), target8));

        int[] nums9 = new int[100000];
        for (int i = 0; i < nums9.length; i++) nums9[i] = (i % 3);
        int target9 = 2;
        System.out.println("nums = large array, target = " + target9 + " -> output = " + solution.search(Arrays.copyOf(nums9, nums9.length), target9));
    }
}