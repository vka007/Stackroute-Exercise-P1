package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vc = null;

    @Before
    public void setUp() throws Exception {

        vc = new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        vc = null;

    }

    @Test
    public void getWordAndCheckIfItIsNotALetter() {

        String result = vc.checkVowelConsonant("2#3");
        assertEquals("The input is not a letter",result);
    }

    @Test
    public void checkFromLetterIfVowel() {

        String result = vc.checkVowelConsonant("i");
        assertEquals("Vowel ",result);
    }

    @Test
    public void checkFromLetterIfConsonant() {

        String result = vc.checkVowelConsonant("v");
        assertEquals("Consonant ",result);
    }

    @Test
    public void checkFromWordIfVowelConsonant() {

        String result = vc.checkVowelConsonant("ap");
        assertEquals("Vowel Consonant ",result);
    }

}