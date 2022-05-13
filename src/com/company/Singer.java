package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(getName() + " singer yrdap jatat");

    }

    public void playGitar() {
        System.out.println(getName() + " igraet na gitare!");

    }

    @Override
    public String toString() {
        return "Singer: " +
                super.toString() +
                "\tbandName - " + bandName;

    }
}
