package com.andrew2dos.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFour {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTwo.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Tuzik");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Naida");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        context.close();
    }
}
