package com.andrew2dos.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTwo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
