package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    Power testobj;

    @org.junit.Before
    public void setUp() throws Exception {
        testobj=new Power();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        testobj=null;
    }
    @Test
    public void givenIntShouldReturnMessage(){
        boolean num=testobj.poweroffour(121);
        assertEquals(false,num);

    }

    @Test
    public void givenIntShouldMessage(){
        boolean num=testobj.poweroffour(16);
        assertEquals(true,num);

    }

    @Test
    public void given0Message(){
        boolean num=testobj.poweroffour(0);
        assertEquals(false,num);

    }
    @Test
    public void givenNegative(){
        boolean num=testobj.poweroffour(-16);
        assertEquals(false,num);

    }

}