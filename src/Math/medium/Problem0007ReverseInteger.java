package Math.medium;

public class Problem0007ReverseInteger {

    public int reverse(int x) {
        int j = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        while (x > 0) {
            int i = x % 10;
            if (j > Integer.MAX_VALUE / 10 || (j == Integer.MAX_VALUE / 10 && i > 7)) return 0;
            if (j < Integer.MIN_VALUE / 10 || (j == Integer.MIN_VALUE / 10 && i < -8)) return 0;
            j = j * 10 + i;
            x /= 10;
        }
        return j * sign;
    }

    public static void main(String[] args) {
        Problem0007ReverseInteger solution = new Problem0007ReverseInteger();

        int test1 = 123;
        int result1 = solution.reverse(test1);
        System.out.println("Test 1 (LeetCode): x=" + test1 + " → " + result1);

        int test2 = -123;
        int result2 = solution.reverse(test2);
        System.out.println("Test 2 (LeetCode): x=" + test2 + " → " + result2);

        int test3 = 120;
        int result3 = solution.reverse(test3);
        System.out.println("Test 3 (LeetCode): x=" + test3 + " → " + result3);

        int test4 = 1534236469;
        int result4 = solution.reverse(test4);
        System.out.println("Test 4 (Custom): x=" + test4 + " → " + result4);

        int test5 = -2147447412;
        int result5 = solution.reverse(test5);
        System.out.println("Test 5 (Custom): x=" + test5 + " → " + result5);

        int test6 = 1000000003;
        int result6 = solution.reverse(test6);
        System.out.println("Test 6 (Custom): x=" + test6 + " → " + result6);

        int test7 = 7;
        int result7 = solution.reverse(test7);
        System.out.println("Test 7 (Custom): x=" + test7 + " → " + result7);
    }
}
