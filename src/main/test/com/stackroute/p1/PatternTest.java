package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {

    Pattern pt = null;

    @Before
    public void setUp() throws Exception {

        pt = new Pattern();
    }

    @After
    public void tearDown() throws Exception {

        pt = null;
    }

    @Test
    public void printThePattern() {

        String result = pt.printPattern(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5",result);
    }
}