package com.bdb.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests {

    private ExtraLongFactorial factorial = new ExtraLongFactorial();

    @Test
    public void calculateFactorial() {
        assertEquals(new BigInteger("120"), factorial.calculate(5));
    }

    @Test
    public void calculateFactorial_zero() {
        assertEquals(new BigInteger("1"), factorial.calculate(0));
    }

    @Test
    public void calculateFactorial_large() {
        assertEquals(new BigInteger("15511210043330985984000000"), factorial.calculate(25));
    }
}
