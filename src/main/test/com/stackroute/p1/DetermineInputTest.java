package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DetermineInputTest {

    DetermineInput di = null;

    @Before
    public void setUp() throws Exception {

        di = new DetermineInput();
    }

    @After
    public void tearDown() throws Exception {
    di = null;
    }

    @Test
    public void checkIfInputIsSmallLetter() {

        String Result = di.determineInput('c');
        assertEquals("c is a small letter",Result);
    }

    @Test
    public void checkIfInputIsCaptialLetter() {

        String Result = di.determineInput('D');
        assertEquals("D is a capital letter",Result);
    }

    @Test
    public void checkIfInputIsSymbol() {

        String Result = di.determineInput('$');
        assertEquals("$ is a symbol",Result);
    }

    @Test
    public void checkIfInputIsDigit() {

        String Result = di.determineInput('6');
        assertEquals("6 is a digit",Result);
    }
}