package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Aidana", "ishteyt", "Peaksoft");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();
        System.out.println();

        Dancer dancer = new Dancer("Zulya", "biyleyt", "Zu_danse");
        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.eat();
        dancer.walk();
        System.out.println();

        Singer singer = new Singer("Malika", "Apake", "Dina");
        System.out.println(singer);
        singer.learn();
        singer.eat();
        singer.walk();
        singer.playGitar();
        singer.singing();
    }
}