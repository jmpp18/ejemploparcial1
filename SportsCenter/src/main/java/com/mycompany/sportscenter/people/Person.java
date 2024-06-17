package com.mycompany.sportscenter.people;

import com.mycompany.sportscenter.role.Role;

public class Person {
    private String name;
    private String ID;
    private int age;
    private String gender;
    private Role role;

    public Person(String name, String ID, int age, String gender, Role role) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }    
    
}
