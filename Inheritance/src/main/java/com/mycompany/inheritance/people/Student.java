package com.mycompany.inheritance.people;

public class Student extends Person {
    private String career;
    private int semester;
    private float average;

    public Student(String career, int semester, float average, String ID, String name, int age) {
        super(ID, name, age);
        this.career = career;
        this.semester = semester;
        this.average = average;
    }

    
    public void seeGrades() {
       System.out.println("Mostrar notas");
    }
    public void registerSubjects() {
       System.out.println("Registrando materias");
    }
    public void cancelSubjects() {
       System.out.println("Cancelando materias");
    }
}
