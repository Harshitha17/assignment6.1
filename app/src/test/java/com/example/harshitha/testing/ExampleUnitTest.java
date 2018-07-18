package com.example.harshitha.testing;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Email_Is_Correct() {
       String actual = "admin";
       String entered ="dabash";
        assertEquals("activity failed due to wrong email", entered, actual);
    }
    @Test
    public void Password_Is_Correct(){
        String actual = "12345";
        String entered ="79886";
        assertEquals("activity failed due to wrong password", entered, actual);
    }
}