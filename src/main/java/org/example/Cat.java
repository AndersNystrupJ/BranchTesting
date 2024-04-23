package org.example;

public class Cat extends Animal{

    public void makeSound(){
        System.out.println("Miav!");
    }

    public boolean eat(String foodType){
        return true;
    }
}
