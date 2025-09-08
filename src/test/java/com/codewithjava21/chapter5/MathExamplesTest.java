package com.codewithjava21.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathExamplesTest {

    @Test
    void add() {
        assertEquals(8, MathExamples.add(5, 3));
    }

    @Test
    void subtract() {
        assertEquals(2, MathExamples.subtract(5, 3));
    }

    @Test
    void multiply() {
        assertEquals(15, MathExamples.multiply(5, 3));
    }

    @Test
    void divide() {
        assertEquals(2, MathExamples.divide(6, 3));
    }

    @Test
    void modulo() {
        assertEquals(0, MathExamples.modulo(6, 3));
    }

    @Test
    void exponent() {
        assertEquals(216, MathExamples.exponent(6, 3));
    }
}