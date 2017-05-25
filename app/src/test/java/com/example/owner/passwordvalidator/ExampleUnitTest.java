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

    @Test
    public void TestPassword() throws Exception {
        assertEquals(1, MainActivity.Validate(test1));
        assertEquals(1, MainActivity.Validate(test2));
    }

    @Test
    public void TestLength() throws Exception {
        assertEquals(1, MainActivity.Validate(test3));
        assertEquals(2, MainActivity.Validate(test4));
        assertEquals(2, MainActivity.Validate(test5));
        assertEquals(1, MainActivity.Validate(test6));
    }
}