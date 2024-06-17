package com.mycompany.inheritance;

import com.mycompany.inheritance.people.Administrative;
import com.mycompany.inheritance.people.Person;

public class Inheritance {

    public static void main(String[] args) {
        Person person1 = new Person("284028", "Charlotte", 28);        
        System.out.println("Persona:");        
        person1.fingerprintRegister();
        
        Administrative admin1 = new Administrative("485672", "Parker", 30, "Luz");
        System.out.println("Administrativo:");
        admin1.fingerprintRegister();
    }
}
