package Math.easy;

public class Problem0013RomanToInteger {

    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    num += 1;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    num += 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    num += 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (getValue(s.charAt(i)) < getValue(s.charAt(i + 1))) {
                num -= 2 * getValue(s.charAt(i));
            }
        }

        return num;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Problem0013RomanToInteger solution = new Problem0013RomanToInteger();

        String test1 = "III";
        int result1 = solution.romanToInt(test1);
        System.out.println("Test 1 (LeetCode): s=\"" + test1 + "\" → " + result1);

        String test2 = "LVIII";
        int result2 = solution.romanToInt(test2);
        System.out.println("Test 2 (LeetCode): s=\"" + test2 + "\" → " + result2);

        String test3 = "MCMXC";
        int result3 = solution.romanToInt(test3);
        System.out.println("Test 3 (LeetCode): s=\"" + test3 + "\" → " + result3);

        String test4 = "IV";
        int result4 = solution.romanToInt(test4);
        System.out.println("Test 4 (Custom): s=\"" + test4 + "\" → " + result4);

        String test5 = "IX";
        int result5 = solution.romanToInt(test5);
        System.out.println("Test 5 (Custom): s=\"" + test5 + "\" → " + result5);

        String test6 = "XL";
        int result6 = solution.romanToInt(test6);
        System.out.println("Test 6 (Custom): s=\"" + test6 + "\" → " + result6);

        String test7 = "CD";
        int result7 = solution.romanToInt(test7);
        System.out.println("Test 7 (Custom): s=\"" + test7 + "\" → " + result7);
    }
}
