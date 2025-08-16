package Math.easy;

public class Problem0326PowerOfThree {

    public boolean isPowerOfThree(int n) {
        for (int i = 0; i < 31; i++) {
            if (n == Math.pow(3, i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Problem0326PowerOfThree solution = new Problem0326PowerOfThree();

        int n1 = 27;
        System.out.println("n = " + n1 + " -> output = " + solution.isPowerOfThree(n1));

        int n2 = 0;
        System.out.println("n = " + n2 + " -> output = " + solution.isPowerOfThree(n2));

        int n3 = 9;
        System.out.println("n = " + n3 + " -> output = " + solution.isPowerOfThree(n3));

        int n4 = 45;
        System.out.println("n = " + n4 + " -> output = " + solution.isPowerOfThree(n4));

        int n5 = 1;
        System.out.println("n = " + n5 + " -> output = " + solution.isPowerOfThree(n5));

        int n6 = -3;
        System.out.println("n = " + n6 + " -> output = " + solution.isPowerOfThree(n6));

        int n7 = 3;
        System.out.println("n = " + n7 + " -> output = " + solution.isPowerOfThree(n7));

        int n8 = 1162261467;
        System.out.println("n = " + n8 + " -> output = " + solution.isPowerOfThree(n8));

        int n9 = Integer.MAX_VALUE;
        System.out.println("n = " + n9 + " -> output = " + solution.isPowerOfThree(n9));
    }
}