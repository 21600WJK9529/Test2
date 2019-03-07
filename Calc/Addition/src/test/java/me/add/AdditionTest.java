package me.add;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void add() {
        Addition add=new Addition();
        assertEquals(3,add.add(1,2));
    }
}