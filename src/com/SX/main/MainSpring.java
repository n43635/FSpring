package com.SX.main;

import com.SX.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String("applicationContext.xml"));

/*        Catagory c = (Catagory) context.getBean("c");
        System.out.println(c.getName());

        Product p = (Product) context.getBean("p");
        System.out.println(p.getName());
        System.out.println(p.getCatagory().getName());

       */

        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();


    }
}
