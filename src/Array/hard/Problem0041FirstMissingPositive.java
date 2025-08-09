package Array.hard;

import java.util.Arrays;

public class Problem0041FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Problem0041FirstMissingPositive solution = new Problem0041FirstMissingPositive();

        int[] nums1 = {1,2,0};
        int result1 = solution.firstMissingPositive(Arrays.copyOf(nums1, nums1.length));
        System.out.println("nums = " + Arrays.toString(nums1) + " -> output = " + result1);

        int[] nums2 = {3,4,-1,1};
        int result2 = solution.firstMissingPositive(Arrays.copyOf(nums2, nums2.length));
        System.out.println("nums = " + Arrays.toString(nums2) + " -> output = " + result2);

        int[] nums3 = {7,8,9,11,12};
        int result3 = solution.firstMissingPositive(Arrays.copyOf(nums3, nums3.length));
        System.out.println("nums = " + Arrays.toString(nums3) + " -> output = " + result3);

        int[] nums4 = {1};
        int result4 = solution.firstMissingPositive(Arrays.copyOf(nums4, nums4.length));
        System.out.println("nums = " + Arrays.toString(nums4) + " -> output = " + result4);

        int[] nums5 = {};
        int result5 = solution.firstMissingPositive(Arrays.copyOf(nums5, nums5.length));
        System.out.println("nums = " + Arrays.toString(nums5) + " -> output = " + result5);

        int[] nums6 = {2};
        int result6 = solution.firstMissingPositive(Arrays.copyOf(nums6, nums6.length));
        System.out.println("nums = " + Arrays.toString(nums6) + " -> output = " + result6);

        int[] nums7 = {2,3,7,6,8,-1,-10,15};
        int result7 = solution.firstMissingPositive(Arrays.copyOf(nums7, nums7.length));
        System.out.println("nums = " + Arrays.toString(nums7) + " -> output = " + result7);

        int[] nums8 = new int[100000];
        for(int i=0;i<100000;i++) nums8[i]=i+2;
        int result8 = solution.firstMissingPositive(Arrays.copyOf(nums8, nums8.length));
        System.out.println("nums = large array, size = 100000 -> output = " + result8);
    }
}