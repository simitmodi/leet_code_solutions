package Math.easy;

public class Problem0342PowerOfFour {

    public boolean isPowerOfFour(int n) {
        for (int i = 0; i < 31; i++) {
            if (n == Math.pow(4, i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Problem0342PowerOfFour solution = new Problem0342PowerOfFour();

        int n1 = 16;
        System.out.println("n = " + n1 + " -> output = " + solution.isPowerOfFour(n1));

        int n2 = 5;
        System.out.println("n = " + n2 + " -> output = " + solution.isPowerOfFour(n2));

        int n3 = 1;
        System.out.println("n = " + n3 + " -> output = " + solution.isPowerOfFour(n3));

        int n4 = 4;
        System.out.println("n = " + n4 + " -> output = " + solution.isPowerOfFour(n4));

        int n5 = 0;
        System.out.println("n = " + n5 + " -> output = " + solution.isPowerOfFour(n5));

        int n6 = -4;
        System.out.println("n = " + n6 + " -> output = " + solution.isPowerOfFour(n6));

        int n7 = 64;
        System.out.println("n = " + n7 + " -> output = " + solution.isPowerOfFour(n7));

        int n8 = 1073741824;
        System.out.println("n = " + n8 + " -> output = " + solution.isPowerOfFour(n8));

        int n9 = Integer.MAX_VALUE;
        System.out.println("n = " + n9 + " -> output = " + solution.isPowerOfFour(n9));
    }
}
