package Strings.easy;

public class Problem0067AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum & 1);
            carry = sum >> 1;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Problem0067AddBinary solution = new Problem0067AddBinary();

        String a1 = "11", b1 = "1";
        System.out.println("a = " + a1 + ", b = " + b1 + " -> output = " + solution.addBinary(a1, b1));

        String a2 = "1010", b2 = "1011";
        System.out.println("a = " + a2 + ", b = " + b2 + " -> output = " + solution.addBinary(a2, b2));

        String a3 = "0", b3 = "0";
        System.out.println("a = " + a3 + ", b = " + b3 + " -> output = " + solution.addBinary(a3, b3));

        String a4 = "1", b4 = "1111111111111111111111111";
        System.out.println("a = " + a4 + ", b = " + b4 + " -> output = " + solution.addBinary(a4, b4));

        String a5 = "1111", b5 = "1111";
        System.out.println("a = " + a5 + ", b = " + b5 + " -> output = " + solution.addBinary(a5, b5));

        String a6 = "", b6 = "0";
        System.out.println("a = \"" + a6 + "\", b = " + b6 + " -> output = " + solution.addBinary(a6, b6));

        StringBuilder largeA = new StringBuilder();
        StringBuilder largeB = new StringBuilder();
        for (int i = 0; i < 100000; i++) { largeA.append('1'); largeB.append('1'); }
        String outLarge = solution.addBinary(largeA.toString(), largeB.toString());
        System.out.println("a,b = very large strings of 100000 '1's each -> output length = " + outLarge.length());
    }
}