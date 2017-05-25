package com.example.owner.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    private String test1 = "password";
    private String test2 = "PaSsWoRd";
    private String test3 = "aaaaaaa";
    private String test4 = "aaaaaaaa";
    private String test5 = "aaaaaaaaa";
    private String test6 = "";
    private String test7 = "a1a";
    private String test8 = "password8";
    private String test9 = "pa";
    private String test10 = "PA";
    private String test11 = "Pa";
    private String test12 = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"; //allowed
    private String test13 = " aA1!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    @Test
    public void TestPassword() throws Exception {
        assertEquals(1, MainActivity.Validate(test1));
        assertEquals(2, MainActivity.Validate(test2));
    }

    @Test
    public void TestLength() throws Exception {
        assertEquals(1, MainActivity.Validate(test3));
        assertEquals(2, MainActivity.Validate(test4));
        assertEquals(2, MainActivity.Validate(test5));
        assertEquals(1, MainActivity.Validate(test6));
    }

    @Test
    public void TestDigit() throws Exception{
        assertEquals(2, MainActivity.Validate(test7));
        assertEquals(3, MainActivity.Validate(test8));
    }

    @Test
    public void TestUpperAndLower() throws Exception{
        assertEquals(1, MainActivity.Validate(test9));
        assertEquals(1, MainActivity.Validate(test10));
        assertEquals(2, MainActivity.Validate(test11));
    }

    @Test
    public void TestSpecChar() throws Exception{
        assertEquals(3, MainActivity.Validate(test12));
        assertEquals(5, MainActivity.Validate(test13));
    }
}