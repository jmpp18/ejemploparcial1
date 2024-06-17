package com.mycompany.inheritance.people;

public class Administrative extends Person {
    
    private String dependency;

    public Administrative(String ID, String name, int age, String dependency) {
        super(ID, name, age);
        this.dependency = dependency;
    }
    
    public void seeData() {
        System.out.println("Mostrar datos al admin");
    }
    
    @Override
    public void fingerprintRegister() {
        System.out.println("Registrando huella dactilar...");
    }
}
