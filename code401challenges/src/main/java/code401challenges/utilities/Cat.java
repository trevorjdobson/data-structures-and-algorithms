package code401challenges.utilities;

public class Cat extends Animal {
    String breed;
    String name;

    Cat(String breed, String name){

        this.breed = breed;
        this.name = name;
    }

    public String toString(){
        return breed + ": " + name;
    }
}
