package Math.easy;

public class Problem0069SqrtX {

    public int mySqrt(int x) {
        if (x < 2) return x;
        long g = x;
        while (g * g > x) {
            g = (g + x / g) / 2;
        }
        return (int) g;
    }

    public static void main(String[] args) {
        Problem0069SqrtX solution = new Problem0069SqrtX();

        int x1 = 4;
        System.out.println("x = " + x1 + " -> output = " + solution.mySqrt(x1));

        int x2 = 8;
        System.out.println("x = " + x2 + " -> output = " + solution.mySqrt(x2));

        int x3 = 0;
        System.out.println("x = " + x3 + " -> output = " + solution.mySqrt(x3));

        int x4 = 1;
        System.out.println("x = " + x4 + " -> output = " + solution.mySqrt(x4));

        int x5 = 2147395599;
        System.out.println("x = " + x5 + " -> output = " + solution.mySqrt(x5));

        int x6 = Integer.MAX_VALUE;
        System.out.println("x = " + x6 + " -> output = " + solution.mySqrt(x6));

        int x7 = 99980001;
        System.out.println("x = " + x7 + " -> output = " + solution.mySqrt(x7));
    }
}