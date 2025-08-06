package Math.medium;

public class Problem0029DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return dividend / divisor;
    }

    public static void main(String[] args) {
        Problem0029DivideTwoIntegers solution = new Problem0029DivideTwoIntegers();

        int dividend1 = 10, divisor1 = 3;
        int result1 = solution.divide(dividend1, divisor1);
        System.out.println("Test 1 (LeetCode): dividend=" + dividend1 + ", divisor=" + divisor1 + " → " + result1);

        int dividend2 = 7, divisor2 = -3;
        int result2 = solution.divide(dividend2, divisor2);
        System.out.println("Test 2 (LeetCode): dividend=" + dividend2 + ", divisor=" + divisor2 + " → " + result2);

        int dividend3 = Integer.MIN_VALUE, divisor3 = -1;
        int result3 = solution.divide(dividend3, divisor3);
        System.out.println("Test 3 (Custom): dividend=" + dividend3 + ", divisor=" + divisor3 + " → " + result3);

        int dividend4 = Integer.MIN_VALUE, divisor4 = 1;
        int result4 = solution.divide(dividend4, divisor4);
        System.out.println("Test 4 (Custom): dividend=" + dividend4 + ", divisor=" + divisor4 + " → " + result4);

        int dividend5 = 100, divisor5 = 10;
        int result5 = solution.divide(dividend5, divisor5);
        System.out.println("Test 5 (Custom): dividend=" + dividend5 + ", divisor=" + divisor5 + " → " + result5);

        int dividend6 = -100, divisor6 = -10;
        int result6 = solution.divide(dividend6, divisor6);
        System.out.println("Test 6 (Custom): dividend=" + dividend6 + ", divisor=" + divisor6 + " → " + result6);

        int dividend7 = 1, divisor7 = 1;
        int result7 = solution.divide(dividend7, divisor7);
        System.out.println("Test 7 (Custom): dividend=" + dividend7 + ", divisor=" + divisor7 + " → " + result7);
    }
}
