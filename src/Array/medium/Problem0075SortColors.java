package Array.medium;

import java.util.Arrays;

public class Problem0075SortColors {

    public void sortColors(int[] nums) {
        int size = nums.length;
        for(int i = 0; i < size-1; i++){
            int minIdx = i;
            for(int j = i+1; j < size; j++){
                if(nums[j] < nums[minIdx]){
                    minIdx = j;
                }
            }
            if(minIdx != i){
                int temp = nums[i];
                nums[i] = nums[minIdx];
                nums[minIdx] = temp;
            }
        }
        for(int i = 0; i < size; i++){
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
        Problem0075SortColors solution = new Problem0075SortColors();

        int[] nums1 = {2,0,2,1,1,0};
        int[] copy1 = Arrays.copyOf(nums1, nums1.length);
        System.out.print("nums = " + Arrays.toString(nums1) + " -> output = ");
        solution.sortColors(copy1);
        System.out.println();

        int[] nums2 = {2,0,1};
        int[] copy2 = Arrays.copyOf(nums2, nums2.length);
        System.out.print("nums = " + Arrays.toString(nums2) + " -> output = ");
        solution.sortColors(copy2);
        System.out.println();

        int[] nums3 = {0};
        int[] copy3 = Arrays.copyOf(nums3, nums3.length);
        System.out.print("nums = " + Arrays.toString(nums3) + " -> output = ");
        solution.sortColors(copy3);
        System.out.println();

        int[] nums4 = {1};
        int[] copy4 = Arrays.copyOf(nums4, nums4.length);
        System.out.print("nums = " + Arrays.toString(nums4) + " -> output = ");
        solution.sortColors(copy4);
        System.out.println();

        int[] nums5 = {2,2,2,2};
        int[] copy5 = Arrays.copyOf(nums5, nums5.length);
        System.out.print("nums = " + Arrays.toString(nums5) + " -> output = ");
        solution.sortColors(copy5);
        System.out.println();

        int[] nums6 = {};
        int[] copy6 = Arrays.copyOf(nums6, nums6.length);
        System.out.print("nums = " + Arrays.toString(nums6) + " -> output = ");
        solution.sortColors(copy6);
        System.out.println();

        int[] nums7 = new int[20];
        for (int i = 0; i < nums7.length; i++) nums7[i] = i % 3;
        int[] copy7 = Arrays.copyOf(nums7, nums7.length);
        System.out.print("nums = " + Arrays.toString(nums7) + " -> output = ");
        solution.sortColors(copy7);
        System.out.println();
    }
}