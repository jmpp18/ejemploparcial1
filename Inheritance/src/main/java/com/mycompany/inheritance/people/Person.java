package com.mycompany.inheritance.people;

public class Person {
    private String ID;
    private String name;
    private int age;
    
    public Person(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }    
    
    public void fingerprintRegister() {
        System.out.println("Registrando huella dactilar...");
    }
    
}
