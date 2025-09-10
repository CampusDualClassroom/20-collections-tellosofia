package com.campusdual.classroom;

public class Teacher extends Person {

    protected String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }

    @Override
    public void getDetails() {
        System.out.println("El nombre completo de la persona es: " + this.name + " " + this.surname);
        System.out.println("Esta persona es de tipo : " + this.getClass().getSimpleName());
        System.out.println("El área docente es: " + this.area + "\n");
    }
}