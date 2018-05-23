package com.SX.test;

import com.SX.pojo.Zoo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAnimal {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Zoo zoo = (Zoo) ctx.getBean("Zoo");
        System.out.println(zoo.toString());
    }
}

