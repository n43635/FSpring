package com.SX.service;

import org.springframework.stereotype.Component;

//业务类
@Component("s")
public class ProductService {
    public void doSomeService(){
        System.out.println("soSomeService");
    }
}
