package me.sub;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractTest {

    @Test
    public void sub() {
        Subtract sub=new Subtract();
        assertEquals(5,sub.sub(7,2));
    }
}