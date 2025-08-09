package Array.medium;

import java.util.Arrays;

public class Problem0034FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findBound(nums, target, true);
        if(result[0] == -1) return result;
        result[1] = findBound(nums, target, false);
        return result;
    }

    private int findBound(int[] nums, int target, boolean isLeft) {
        int left = 0, right = nums.length - 1;
        int result = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                result = mid;
                if(isLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem0034FindFirstAndLastPositionOfElementInSortedArray solution = new Problem0034FindFirstAndLastPositionOfElementInSortedArray();

        int[] nums1 = {5,7,7,8,8,10}; int target1 = 8;
        int[] res1 = solution.searchRange(nums1, target1);
        System.out.println("nums = " + Arrays.toString(nums1) + ", target = " + target1 + " -> output = " + Arrays.toString(res1));

        int[] nums2 = {5,7,7,8,8,10}; int target2 = 6;
        int[] res2 = solution.searchRange(nums2, target2);
        System.out.println("nums = " + Arrays.toString(nums2) + ", target = " + target2 + " -> output = " + Arrays.toString(res2));

        int[] nums3 = {}; int target3 = 0;
        int[] res3 = solution.searchRange(nums3, target3);
        System.out.println("nums = " + Arrays.toString(nums3) + ", target = " + target3 + " -> output = " + Arrays.toString(res3));

        int[] nums4 = {1}; int target4 = 1;
        int[] res4 = solution.searchRange(nums4, target4);
        System.out.println("nums = " + Arrays.toString(nums4) + ", target = " + target4 + " -> output = " + Arrays.toString(res4));

        int[] nums5 = {2,2}; int target5 = 2;
        int[] res5 = solution.searchRange(nums5, target5);
        System.out.println("nums = " + Arrays.toString(nums5) + ", target = " + target5 + " -> output = " + Arrays.toString(res5));

        int[] nums7 = {1,2,3,4,5,6,7,8,9,10}; int target7 = 11;
        int[] res7 = solution.searchRange(nums7, target7);
        System.out.println("nums = " + Arrays.toString(nums7) + ", target = " + target7 + " -> output = " + Arrays.toString(res7));
    }
}