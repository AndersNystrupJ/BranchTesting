package org.example;

public abstract class Animal {
    private String name;

    public Animal (String name){
        this.name = name;
    }
    public void makeSound(){
    }

    public boolean eat(String foodType){
        return true;
    }

    public void mood(boolean glad){

    }

    public String getName(){
        return name;
    }
}
