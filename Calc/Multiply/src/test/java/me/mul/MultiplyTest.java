package me.mul;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void mult() {
        Multiply mul=new Multiply();
        assertEquals(30,mul.mult(5,6));
    }
}