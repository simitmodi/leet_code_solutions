package Array.easy;

public class Problem0001TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Problem0001TwoSum solution = new Problem0001TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1 (LeetCode): nums=[2,7,11,15], target=9 → [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test 2 (LeetCode): nums=[3,2,4], target=6 → [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test 3 (LeetCode): nums=[3,3], target=6 → [" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {1, 2, 3, 4, 5};
        int target4 = 9;
        int[] result4 = solution.twoSum(nums4, target4);
        System.out.println("Test 4 (Custom): nums=[1,2,3,4,5], target=9 → [" + result4[0] + ", " + result4[1] + "]");

        int[] nums5 = {5, 5, 5, 5};
        int target5 = 10;
        int[] result5 = solution.twoSum(nums5, target5);
        System.out.println("Test 5 (Custom): nums=[5,5,5,5], target=10 → [" + result5[0] + ", " + result5[1] + "]");

        int[] nums6 = {1, 3, 7, 9, 2};
        int target6 = 11;
        int[] result6 = solution.twoSum(nums6, target6);
        System.out.println("Test 6 (Custom): nums=[1,3,7,9,2], target=11 → [" + result6[0] + ", " + result6[1] + "]");

        int[] nums7 = {-1, -2, -3, -4, -5};
        int target7 = -8;
        int[] result7 = solution.twoSum(nums7, target7);
        System.out.println("Test 7 (Custom): nums=[-1,-2,-3,-4,-5], target=-8 → [" + result7[0] + ", " + result7[1] + "]");
    }
}
