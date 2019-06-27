package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome pal = null;

    @Before
    public void setUp() throws Exception {

    pal = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        pal = null;

    }

    @Test
    public void getANumberAndCheckIfNumberIsPallindromeAndSumIsGreaterThan25(){

        String result = pal.checkPallindrome(567898765);
        assertEquals("The No is pallindrome and its sum of its digit is greater than 25",result);

    }

    @Test
    public void getANumberAndCheckIfNumberIsPallindromeAndSumIsNotGreaterThan25(){

        String result = pal.checkPallindrome(1234321);
        assertEquals("The No is pallindrome and its sum of its digit is not greater than 25",result);

    }

    @Test
    public void getANumberAndCheckIfNumberIsPallindrome(){

        String result = pal.checkPallindrome(1298765);
        assertEquals("The No is not pallindrome",result);

    }
}