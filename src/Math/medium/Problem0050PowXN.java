package Math.medium;

public class Problem0050PowXN {

    public double myPow(double x, int n) {
        double res = 1;
        boolean neg = false;
        long pw = n;
        if (n < 0) {
            neg = true;
            pw = pw * (-1);
        }
        while (pw > 0) {
            if (pw % 2 == 0) {
                x *= x;
                pw /= 2;
            } else {
                res *= x;
                pw--;
            }
        }
        return neg ? (1 / res) : res;
    }

    public static void main(String[] args) {
        Problem0050PowXN solution = new Problem0050PowXN();

        double result1 = solution.myPow(2.00000, 10);
        System.out.println("x = 2.0, n = 10 -> output = " + result1);

        double result2 = solution.myPow(2.10000, 3);
        System.out.println("x = 2.1, n = 3 -> output = " + result2);

        double result3 = solution.myPow(2.00000, -2);
        System.out.println("x = 2.0, n = -2 -> output = " + result3);

        double result4 = solution.myPow(1.00000, 2147483647);
        System.out.println("x = 1.0, n = 2147483647 -> output = " + result4);

        double result5 = solution.myPow(2.00000, 0);
        System.out.println("x = 2.0, n = 0 -> output = " + result5);

        double result6 = solution.myPow(-2.00000, 9);
        System.out.println("x = -2.0, n = 9 -> output = " + result6);

        double result7 = solution.myPow(2.00000, -2147483648);
        System.out.println("x = 2.0, n = -2147483648 -> output = " + result7);
    }
}