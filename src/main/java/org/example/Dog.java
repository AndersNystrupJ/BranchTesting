package org.example;

public class Dog extends Animal{


    public void makeSound(){
        System.out.println("Woouf!");
    }

    public boolean eat(String foodType){
        return true;
    }

    public void mood(boolean glad){
        if (glad = true) {
            System.out.println("logrer");
        } else {
            System.out.println("knurrer");
        }
    }
}
