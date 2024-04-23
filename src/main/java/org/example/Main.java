package org.example;
public class Main {

    public static void main(String[] args) {

    Dog king = new Dog("King");

    Cat misse = new Cat("Misse");

    king.makeSound();
    misse.makeSound();

    king.eat("kødben");
    misse.eat("tun");

    king.mood(true);
    misse.mood(false);


    }
}