package com.bdb.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtoiTests {

    private Atoi atoi = new Atoi();

    @Test
    public void myAtoi() {
        assertEquals(42, atoi.myAtoi("42"));
    }

    @Test
    public void myAtoi_negative() {
        assertEquals(-42, atoi.myAtoi("  -42"));
    }

    @Test
    public void myAtoi_textLast() {
        assertEquals(4193, atoi.myAtoi("4193 with words."));
    }

    @Test
    public void myAtoi_numberLast() {
        assertEquals(0, atoi.myAtoi("words and 987"));
    }

    @Test
    public void myAtoi_intRange() {
        assertEquals(-2147483648, atoi.myAtoi("-91283472332"));
    }

}
