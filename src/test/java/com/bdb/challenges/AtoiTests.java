package com.bdb.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtoiTests {

    private Atoi atoi = new Atoi();

    @Test
    public void myAtoi(String input) {
        assertEquals(42, atoi.myAtoi("42"));
        assertEquals(-42, atoi.myAtoi("  -42"));
        assertEquals(4193, atoi.myAtoi("4193 with words."));
        assertEquals(0, "words and 987");
    }

}
