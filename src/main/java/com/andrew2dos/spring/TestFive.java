package com.andrew2dos.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFive {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTwo.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
        context.close();
    }
}
