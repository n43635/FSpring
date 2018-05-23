package com.SX.test;

import com.SX.pojo.Catagory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MainSpringTest {

    @Autowired
    Catagory c;

    @Before
    public void setUp() throws Exception {
        System.out.println("begin");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("end");
    }

    @Test
    public void test() throws Exception {
        System.out.println(c.getName());
    }

}
