package com.bdb.challenges;

/**
 * Implement atoi which converts a string to an integer.
 *
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 *
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 *
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 *
 * If no valid conversion could be performed, a zero value is returned.
 */
class Atoi {
    private static final int WHITESPACE = 32;
    private static final int ZERO = 48;
    private static final int NINE = 57;

    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int idx = 0;

        while (idx < s.length() && s.charAt(idx) == WHITESPACE) {
            idx++;
        }

        int sign = 1;

        if (idx < s.length() && isSign(s.charAt(idx))) {
            sign = (s.charAt(idx) == '-') ? -1 : 1;
            idx++;
        }

        return transformNumber(s, idx, sign);
    }

    private int transformNumber(String s, int idx, int sign) {
        int result = 0;
        while (idx < s.length() && isNumber(s.charAt(idx))) {
            int digit = getNumber(s, idx);
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = (result * 10) + digit;
            idx++;
        }

        return result * sign;
    }

    private int getNumber(String s, int idx) {
        return s.charAt(idx) - ZERO;
    }

    private boolean isSign(char c) {
        return c == '-' || c == '+';
    }

    private boolean isNumber(char c) {
        return c >= ZERO && c <= NINE;
    }

}
