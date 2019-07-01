package com.stackroute.pe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsEvenTest {
    IsEven od;


    @Test
    public void givenNumberShouldReturnMessage(){
        boolean result=od.isEvenNum(25);
        assertEquals(false,result);
    }

    @Test
    public void givenNumberShouldReturnJerryMessage(){
        boolean result=od.isEvenNum(26);
        assertEquals(true,result);
    }

    @Test
    public void givenNumberShouldReturnNoneMessage(){
        boolean result=od.isEvenNum(125);
        assertEquals(false,result);
    }
    @Test
    public void givenNumberShouldReturn(){
        boolean result=od.isEvenNum(0);
        assertEquals(true,result);
    }



}