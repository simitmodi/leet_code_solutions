package Math.easy;

public class Problem1323Maximum69Number {

    public int maximum69Number(int num) {
        String s = Integer.toString(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 6) {
                digits[i] = 9;
                break;
            } else {
                continue;
            }
        }
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        Problem1323Maximum69Number solution = new Problem1323Maximum69Number();

        int num1 = 9669;
        System.out.println("num = " + num1 + " -> output = " + solution.maximum69Number(num1));

        int num2 = 9996;
        System.out.println("num = " + num2 + " -> output = " + solution.maximum69Number(num2));

        int num3 = 9999;
        System.out.println("num = " + num3 + " -> output = " + solution.maximum69Number(num3));

        int num4 = 6;
        System.out.println("num = " + num4 + " -> output = " + solution.maximum69Number(num4));

        int num5 = 9;
        System.out.println("num = " + num5 + " -> output = " + solution.maximum69Number(num5));

        int num6 = 6666;
        System.out.println("num = " + num6 + " -> output = " + solution.maximum69Number(num6));

        int num7 = 6969;
        System.out.println("num = " + num7 + " -> output = " + solution.maximum69Number(num7));

        int num8 = 9696;
        System.out.println("num = " + num8 + " -> output = " + solution.maximum69Number(num8));

        int num9 = 96969696;
        System.out.println("num = " + num9 + " -> output = " + solution.maximum69Number(num9));
    }
}
