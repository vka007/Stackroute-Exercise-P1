package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {

    RepeatString ob = null;

    @Before
    public void setUp() throws Exception {
        ob = new RepeatString();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void getAStringAndANumberAndRepeatTheLastNumberOfCharatcers()
    {
        String result = ob.repeatString("vineet",3);
        assertEquals("vineeteeteeteet",result);
    }

    @Test
    public void getAStringAndANumberAndRepeatTheLastNumberOfCharatcersAgain()
    {
        String result = ob.repeatString("stackroute",5);
        assertEquals("stackrouterouterouterouterouteroute",result);
    }
}