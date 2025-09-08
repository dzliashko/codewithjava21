package com.codewithjava21.chapter5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathExamplesTests {
    @Test
    public void testAdd() {
        assertEquals(8, MathExamples.add(5, 3));
        assertEquals(12, MathExamples.add(6, 6));
    }
}
