package com.campusdual.classroom;

public class Doctor extends Person {

    protected String specialization;

    public Doctor(String name, String surname, String specialization) {
        super(name, surname);
        this.specialization = specialization;
    }

    @Override
    public void getDetails() {
        System.out.println("El nombre completo de la persona es: " + this.name + " " + this.surname);
        System.out.println("Esta persona es de tipo : " + this.getClass().getSimpleName());
        System.out.println("La especialización es: " + this.specialization + "\n");
    }
}