package com.zaheer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        PaymentService variable = context.getBean(PaymentService.class);
        variable.pay(500);


    }
}



