package com.SX.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Zoo {

    @Autowired(required = false)
    private Tiger tiger;

    @Autowired(required = false)
    private Monkey monkey;

    //使用@Autowired后不需要getter和setter了
    //springXML中配置<context:component-scan base-package="com.SX.pojo"/>即可,会自动扫描@Autowired
/*

    public Tiger getTiger() {
        return tiger;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }
*/

    @Override
    public String toString() {
        return "Zoo{" +
                "tiger=" + tiger +
                ", monkey=" + monkey +
                '}';
    }
}
