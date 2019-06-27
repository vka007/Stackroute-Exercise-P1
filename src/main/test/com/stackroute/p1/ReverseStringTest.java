package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString ob = null;

    @Before
    public void setUp() throws Exception {
        ob = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void getWordAndReverseString() {
        String result = ob.stringReverse("stackroute");
        assertEquals("etuorkcats",result);
    }

    @Test
    public void getWordAndReverseStringAgain() {
        String result = ob.stringReverse("vineet");
        assertEquals("teeniv",result);
    }


}