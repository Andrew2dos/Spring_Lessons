package com.andrew2dos.spring;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    String name;
    public Dog(){
        System.out.println("Dog have being created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("Bow-Wow");
    }

    private void init() {
        System.out.println("Method: init");
    }

    private void destroy() {
        System.out.println("Method: destroy");
    }
}
