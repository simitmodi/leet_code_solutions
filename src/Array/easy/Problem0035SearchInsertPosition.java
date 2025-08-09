package Array.easy;

import java.util.Arrays;

public class Problem0035SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Problem0035SearchInsertPosition solution = new Problem0035SearchInsertPosition();

        int[] nums1 = {1,3,5,6}; int target1 = 5;
        int result1 = solution.searchInsert(nums1, target1);
        System.out.println("nums = " + Arrays.toString(nums1) + ", target = " + target1 + " -> output = " + result1);

        int[] nums2 = {1,3,5,6}; int target2 = 2;
        int result2 = solution.searchInsert(nums2, target2);
        System.out.println("nums = " + Arrays.toString(nums2) + ", target = " + target2 + " -> output = " + result2);

        int[] nums3 = {1,3,5,6}; int target3 = 7;
        int result3 = solution.searchInsert(nums3, target3);
        System.out.println("nums = " + Arrays.toString(nums3) + ", target = " + target3 + " -> output = " + result3);

        int[] nums4 = {1,3,5,6}; int target4 = 0;
        int result4 = solution.searchInsert(nums4, target4);
        System.out.println("nums = " + Arrays.toString(nums4) + ", target = " + target4 + " -> output = " + result4);

        int[] nums5 = {1}; int target5 = 0;
        int result5 = solution.searchInsert(nums5, target5);
        System.out.println("nums = " + Arrays.toString(nums5) + ", target = " + target5 + " -> output = " + result5);

        int[] nums6 = {}; int target6 = 1;
        int result6 = solution.searchInsert(nums6, target6);
        System.out.println("nums = " + Arrays.toString(nums6) + ", target = " + target6 + " -> output = " + result6);

        int[] nums7 = new int[100000];
        for(int i=0;i<100000;i++) nums7[i] = i*2;
        int target7 = 199998;
        int result7 = solution.searchInsert(nums7, target7);
        System.out.println("nums = large array, target = " + target7 + " -> output = " + result7);

        int target8 = 100001;
        int result8 = solution.searchInsert(nums7, target8);
        System.out.println("nums = large array, target = " + target8 + " -> output = " + result8);
    }
}