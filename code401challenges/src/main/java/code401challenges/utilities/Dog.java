package code401challenges.utilities;

public class Dog extends Animal{
    String breed;
    String name;

    Dog(String breed, String name){

        this.breed = breed;
        this.name = name;
    }
    public String toString(){
        return breed + ": " + name;
    }
}
