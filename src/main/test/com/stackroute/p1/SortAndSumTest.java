package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAndSumTest {

    SortAndSum ob = null;

    @Before
    public void setUp() throws Exception {

        ob= new SortAndSum();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void numsort()
    {
        String result=ob.numberSort(12345678);
        assertEquals("true",result);
    }
    @Test
    public void numsorttwo()
    {
        String result=ob.numberSort(1234567892);
        assertEquals("true",result);
    }
    @Test
    public void numsortthree()
    {
        String result=ob.numberSort(1234);
        assertEquals("false",result);
    }

}