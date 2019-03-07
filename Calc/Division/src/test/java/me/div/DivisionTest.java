package me.div;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void div() {
        Division div=new Division();
        assertEquals(2,div.div(10,5));
    }
}