package com.andrew2dos.spring;

import org.springframework.stereotype.Component;

@Component("catBean")

public class Cat implements Pet {
    public Cat(){
        System.out.println("The cat was created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
