package org.example;

public class Cat extends Animal{

    public void makeSound(){
        System.out.println("Miav!");
    }

    public boolean eat(String foodType){
        return true;
    }

    public void mood(boolean glad){
        if (glad = true) {
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }
}
