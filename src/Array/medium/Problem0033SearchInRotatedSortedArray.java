package Array.medium;

public class Problem0033SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Problem0033SearchInRotatedSortedArray solution = new Problem0033SearchInRotatedSortedArray();

        int[] nums1 = {4,5,6,7,0,1,2}; int target1 = 0;
        int result1 = solution.search(nums1, target1);
        System.out.println("Test 1 (LeetCode): nums={4,5,6,7,0,1,2}, target=0 → " + result1);

        int[] nums2 = {4,5,6,7,0,1,2}; int target2 = 3;
        int result2 = solution.search(nums2, target2);
        System.out.println("Test 2 (LeetCode): nums={4,5,6,7,0,1,2}, target=3 → " + result2);

        int[] nums3 = {1}; int target3 = 0;
        int result3 = solution.search(nums3, target3);
        System.out.println("Test 3 (LeetCode): nums={1}, target=0 → " + result3);

        int[] nums4 = {1}; int target4 = 1;
        int result4 = solution.search(nums4, target4);
        System.out.println("Test 4 (LeetCode): nums={1}, target=1 → " + result4);

        int[] nums5 = new int[100000];
        for (int i = 0; i < 100000; i++) nums5[i] = (i + 12345) % 100000;
        int target5 = 99999;
        int result5 = solution.search(nums5, target5);
        System.out.println("Test 5 (Worst): nums.length=100000, target=99999 → " + result5);

        int target6 = 100001;
        int result6 = solution.search(nums5, target6);
        System.out.println("Test 6 (Worst): nums.length=100000, target=100001 → " + result6);

        int[] nums6 = {};
        int target7 = 5;
        int result7 = solution.search(nums6, target7);
        System.out.println("Test 7 (Worst): nums={}, target=5 → " + result7);

        int[] nums7 = new int[5000];
        for (int i = 0; i < 5000; i++) nums7[i] = 1;
        nums7[1234] = 999;
        int target8 = 999;
        int result8 = solution.search(nums7, target8);
        System.out.println("Test 8 (Worst): nums.length=5000, target=999 → " + result8);

        int[] nums8 = {3,1};
        int target9 = 1;
        int result9 = solution.search(nums8, target9);
        System.out.println("Test 9 (LeetCode): nums={3,1}, target=1 → " + result9);
    }
}