package org.example;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }


    public void makeSound(String sound){
        System.out.println("woof!");
    }

    public boolean eat(String foodType){
        return true;
    }

    public void mood(boolean glad){
        if (glad = true) {
            System.out.println(getName() + " logrer");
        } else {
            System.out.println(getName() + " knurrer");
        }
    }
}
