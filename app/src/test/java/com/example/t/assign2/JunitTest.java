package com.example.t.assign2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JunitTest {

    // initialize a new Validator class
    private Validator testInstance;

    @Before
    public void SetEnvironment() {
        testInstance = new Validator();
    }

    @Test
    public void Pass_One_Rule1() {
        assertEquals(1, testInstance.Password_Strength("password"));
    }

    @Test
    public void Pass_One_Rule2() {
        assertEquals(1, testInstance.Password_Strength("abcdefg"));
    }

    @Test
    public void Pass_One_Rules_Edge() {
        assertEquals(1, testInstance.Password_Strength(""));
    }

    @Test
    public void Pass_Two_Rules1() {
        assertEquals(2, testInstance.Password_Strength("StrongPassword"));
    }

    @Test
    public void Pass_Two_Rules2() {
        assertEquals(2, testInstance.Password_Strength("Password1"));
    }

}
