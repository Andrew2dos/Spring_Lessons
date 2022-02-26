package com.andrew2dos.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotationsOne {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextThree.xml");

//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname() + person.getAge());

        context.close();
    }
}
