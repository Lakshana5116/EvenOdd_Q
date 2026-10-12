package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    @Test
    public void testEven() {
        assertEquals("Even", new EvenOdd().checkNumber(10));
    }

    @Test
    public void testOdd() {
        assertEquals("Odd", new EvenOdd().checkNumber(7));
    }
}