package com.bdb.challenges;

import java.math.BigInteger;

/*
    Exercise: https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */
public class ExtraLongFactorial {

    public BigInteger calculate(int input) {
        BigInteger result = BigInteger.ONE;
        for (int current = input; current > 0; current--) {
            result = result.multiply(BigInteger.valueOf(current));
        }

        return result;
    }

}
