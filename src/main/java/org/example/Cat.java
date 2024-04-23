package org.example;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public void makeSound(String sound){
        System.out.println("Miav!");
    }

    public boolean eat(String foodType){
        return true;
    }

    public void mood(boolean glad){
        if (glad = true) {
            System.out.println(getName() + " spinder");
        } else {
            System.out.println(getName() + " hvæser");
        }
    }
}
