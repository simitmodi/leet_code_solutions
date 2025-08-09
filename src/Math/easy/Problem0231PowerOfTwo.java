package Math.easy;

public class Problem0231PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Problem0231PowerOfTwo solution = new Problem0231PowerOfTwo();

        int n1 = 1;
        System.out.println("n = " + n1 + " -> output = " + solution.isPowerOfTwo(n1));

        int n2 = 16;
        System.out.println("n = " + n2 + " -> output = " + solution.isPowerOfTwo(n2));

        int n3 = 3;
        System.out.println("n = " + n3 + " -> output = " + solution.isPowerOfTwo(n3));

        int n4 = 0;
        System.out.println("n = " + n4 + " -> output = " + solution.isPowerOfTwo(n4));

        int n5 = -2;
        System.out.println("n = " + n5 + " -> output = " + solution.isPowerOfTwo(n5));

        int n6 = Integer.MAX_VALUE;
        System.out.println("n = " + n6 + " -> output = " + solution.isPowerOfTwo(n6));

        int n7 = 1073741824;
        System.out.println("n = " + n7 + " -> output = " + solution.isPowerOfTwo(n7));
    }
}