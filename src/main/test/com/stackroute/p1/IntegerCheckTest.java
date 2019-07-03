package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerCheckTest {

    IntegerCheck chk = null;

    @Before
    public void setUp() throws Exception {

        chk = new IntegerCheck();
    }

    @After
    public void tearDown() throws Exception {

        chk = null;
    }

    @Test
    public void getANumberAndCheckIfItIsBetween20And30AndCheckIfItIsOdd() {

        String result = chk.intCheck(25);
        assertEquals("Tom",result);
    }

    @Test
    public void getANumberAndCheckIfItIsBetween20And30AndCheckIfItIsEven() {

        String result = chk.intCheck(22);
        assertEquals("Jerry",result);
    }
    @Test
    public void getANumberAndCheckIfItIsNotBetween20And30() {

        String result = chk.intCheck(32);
        assertEquals("Invalid input.Enter integer\n",result);
    }

    @Test
    public void getANumberAndCheckInvalidinput() {

        String result = chk.intCheck(32);
        assertEquals("Invalid input.Enter integer\n",result);
    }

}