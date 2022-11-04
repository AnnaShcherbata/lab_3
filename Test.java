package org.example;

import static org.junit.Assert.*;

public class Test {
    @org.junit.Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(10);
        int expected = 55;
        assertEquals(expected, actual);
    }
}
