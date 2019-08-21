package code401challenges.utilities;


import code401challenges.stacksandqueues.Queue;

public class AnimalShelter {
    Queue<Dog> dogs = new Queue();
    Queue<Cat> cats = new Queue();

    public void enqueue(Animal animal){
        if(animal instanceof Dog){
            dogs.enqueue((Dog) animal);
        }
        if(animal instanceof Cat){
            cats.enqueue((Cat) animal);
        }
    }

    public Animal dequeue(String type){


            if (type.toUpperCase().equals("CAT")) {
                return cats.dequeue();
            }
            if (type.toUpperCase().equals("DOG")) {
                return dogs.dequeue();
            }

        return null;
    }

    public String toString(){
        return dogs.toString() + "\n" + cats.toString();
    }

}
