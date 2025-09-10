package com.campusdual.classroom;

public class PoliceOfficer extends Person {

    protected String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }

    @Override
    public void getDetails() {
        System.out.println("El nombre completo de la persona es: " + this.name + " " + this.surname);
        System.out.println("Esta persona es de tipo : " + this.getClass().getSimpleName());
        System.out.println("El equipo al que pertenece es: " + this.squad + "\n");
    }
}