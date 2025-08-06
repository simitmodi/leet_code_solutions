package Math.easy;

public class Problem0009PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Problem0009PalindromeNumber solution = new Problem0009PalindromeNumber();

        int test1 = 121;
        boolean result1 = solution.isPalindrome(test1);
        System.out.println("Test 1 (LeetCode): x=" + test1 + " → " + result1);

        int test2 = -121;
        boolean result2 = solution.isPalindrome(test2);
        System.out.println("Test 2 (LeetCode): x=" + test2 + " → " + result2);

        int test3 = 10;
        boolean result3 = solution.isPalindrome(test3);
        System.out.println("Test 3 (LeetCode): x=" + test3 + " → " + result3);

        int test4 = 12321;
        boolean result4 = solution.isPalindrome(test4);
        System.out.println("Test 4 (Custom): x=" + test4 + " → " + result4);

        int test5 = 0;
        boolean result5 = solution.isPalindrome(test5);
        System.out.println("Test 5 (Custom): x=" + test5 + " → " + result5);

        int test6 = 7;
        boolean result6 = solution.isPalindrome(test6);
        System.out.println("Test 6 (Custom): x=" + test6 + " → " + result6);

        int test7 = 1234321;
        boolean result7 = solution.isPalindrome(test7);
        System.out.println("Test 7 (Custom): x=" + test7 + " → " + result7);
    }
}
