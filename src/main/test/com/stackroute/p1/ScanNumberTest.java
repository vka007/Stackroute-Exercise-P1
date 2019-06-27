package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ScanNumberTest {

    ScanNumber sn = null;

    @Before
    public void setUp() throws Exception {

        sn = new ScanNumber();
    }

    @After
    public void tearDown() throws Exception {
        sn = null;
    }

    @Test
    public void scanInputAndSumUntilNumberSmallerThan6digit(int n) {

        int result = sn.scanAndSum(1000);
        assertEquals(5000,result);
    }
}