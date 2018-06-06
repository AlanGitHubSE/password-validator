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
        //Pass rule 2
        assertEquals(1, testInstance.Password_Strength("password"));
    }

    @Test
    public void Pass_One_Rule2() {
        //Pass rule 1
        assertEquals(1, testInstance.Password_Strength("abcdefg"));
    }

    @Test
    public void Pass_One_Rules_Edge() {
        //Pass rule 1
        assertEquals(1, testInstance.Password_Strength(""));
    }

    @Test
    public void Pass_Two_Rules1() {
        //Pass rule 1 & 2
        assertEquals(2, testInstance.Password_Strength("abcdefgh"));
    }

    @Test
    public void Pass_Two_Rules2() {
        //Pass rule 1 & 5
        assertEquals(2, testInstance.Password_Strength("Uu"));
    }

    @Test
    public void Pass_Three_Rules1() {
        //Pass rule 1 & 2 & 3
        assertEquals(3, testInstance.Password_Strength("password!"));
    }

    @Test
    public void Pass_Three_Rules2() {
        //Pass rule 1 & 2 & 4
        assertEquals(3, testInstance.Password_Strength("password1"));
    }

    @Test
    public void Pass_Four_Rules1() {
        //Pass rule 1 & 2 & 3 & 4
        assertEquals(4, testInstance.Password_Strength("abcdefg!1"));
    }

    @Test
    public void Pass_Four_Rules2() {
        //Pass rule 1 & 2 & 3 & 5
        assertEquals(4, testInstance.Password_Strength("ABCdefgh!"));
    }

    @Test
    public void Pass_Five_Rules1() {
        //Pass rule 1 & 2 & 3 & 4 & 5
        assertEquals(5, testInstance.Password_Strength("StrongPassword!1"));
    }

}
