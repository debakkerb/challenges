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

        StringBuilder input = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != WHITESPACE) {
                if (isNumber(c)) {
                    input.append(c);
                } else if (isSign(c) && input.length() == 0) {
                    input.append(c);
                }
            }
        }

        return transformNumber(input);
    }

    private boolean isSign(char c) {
        return c == '-' || c == '+';
    }

    private boolean isNumber(char c) {
        return c >= ZERO && c <= NINE;
    }

    private int transformNumber(StringBuilder input) {
        int result = 0;
        for (int idx = 0; idx < input.length(); idx++) {
            int number = (int) input.charAt(idx) - ZERO;
            result = (result * 10) + number;
        }

        return result;
    }

}
