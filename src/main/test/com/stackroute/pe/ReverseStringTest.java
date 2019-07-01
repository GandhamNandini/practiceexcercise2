package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString testobj;

    @org.junit.Before
    public void setUp() throws Exception {
        testobj=new ReverseString();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        testobj=null;
    }
    @Test
    public void givenIntShouldReturnMessage(){
        int reverse=testobj.reverseinput(121);
        assertEquals(121,reverse);
        String res=testobj.checkInput(121);
        assertEquals("palindrome",res);
    }

    @Test
    public void check(){
        int reverse=testobj.reverseinput(0);
        assertEquals(0,reverse);
        String res=testobj.checkInput(0);
        assertEquals("palindrome",res);
    }


    @Test
    public void check1(){
        int reverse=testobj.reverseinput(-121);
        assertEquals(0,reverse);
        String res=testobj.checkInput(-121);
        assertEquals("not a palindrome",res);
    }


}