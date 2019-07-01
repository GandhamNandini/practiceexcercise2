package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student testobj;
    @Before
    public void setUp(){
        testobj=new Student();
    }
    @After
    public void  tearDown(){
        testobj=null;
    }
    @Test
    public void givenStudentDataShouldReturnoutput(){
        float[] result=testobj.studentData(4,new int[]{86,87,88,89});
        assertArrayEquals(new float[]{87.5f,86,89},result,2);

    }
    @Test
    public void check(){
        float[] result=testobj.studentData(4,new int[]{0,5,88,89});
        assertArrayEquals(new float[]{45.0f,0,89},result,2);

    }

}