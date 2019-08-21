package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqueue() {
        AnimalShelter testAnimalShelter = new AnimalShelter();
        Dog testDog = new Dog("lab","harold");
        Cat testCat = new Cat("harry cat","fluffy");
        testAnimalShelter.enqueue(testDog);
        testAnimalShelter.enqueue(testCat);
        String expected = "Front --> lab: harold <-- Back\n" +
                "Front --> harry cat: fluffy <-- Back";
        assertEquals(expected,testAnimalShelter.toString());
    }
    @Test
    public void enqueue_lots() {
        AnimalShelter testAnimalShelter = new AnimalShelter();
        Dog testDog = new Dog("lab","harold");
        Cat testCat = new Cat("harry cat","fluffy");
        Dog testDog1 = new Dog("husky","ginger");
        Cat testCat1 = new Cat("fat cat","crazy");
        Dog testDog2 = new Dog("pitbull","sweetie pie");
        Cat testCat2 = new Cat("regular cat","muffin");
        testAnimalShelter.enqueue(testDog);
        testAnimalShelter.enqueue(testCat);
        testAnimalShelter.enqueue(testDog1);
        testAnimalShelter.enqueue(testCat1);
        testAnimalShelter.enqueue(testDog2);
        testAnimalShelter.enqueue(testCat2);
        String expected = "Front --> lab: harold --> husky: ginger --> pitbull: sweetie pie <-- Back\n" +
                "Front --> harry cat: fluffy --> fat cat: crazy --> regular cat: muffin <-- Back";
        assertEquals(expected,testAnimalShelter.toString());
    }


    @Test
    public void dequeue_dog() {
        AnimalShelter testAnimalShelter = new AnimalShelter();
        Dog testDog = new Dog("lab","harold");
        Cat testCat = new Cat("harry cat","fluffy");
        Dog testDog1 = new Dog("husky","ginger");
        Cat testCat1 = new Cat("fat cat","crazy");
        Dog testDog2 = new Dog("pitbull","sweetie pie");
        Cat testCat2 = new Cat("regular cat","muffin");
        testAnimalShelter.enqueue(testDog);
        testAnimalShelter.enqueue(testCat);
        testAnimalShelter.enqueue(testDog1);
        testAnimalShelter.enqueue(testCat1);
        testAnimalShelter.enqueue(testDog2);
        testAnimalShelter.enqueue(testCat2);
        testAnimalShelter.dequeue("dog");
        String expected = "Front --> husky: ginger --> pitbull: sweetie pie <-- Back\n" +
                "Front --> harry cat: fluffy --> fat cat: crazy --> regular cat: muffin <-- Back";
        assertEquals(expected,testAnimalShelter.toString());
    }
    @Test
    public void dequeue_cat() {
        AnimalShelter testAnimalShelter = new AnimalShelter();
        Dog testDog = new Dog("lab","harold");
        Cat testCat = new Cat("harry cat","fluffy");
        Dog testDog1 = new Dog("husky","ginger");
        Cat testCat1 = new Cat("fat cat","crazy");
        Dog testDog2 = new Dog("pitbull","sweetie pie");
        Cat testCat2 = new Cat("regular cat","muffin");
        testAnimalShelter.enqueue(testDog);
        testAnimalShelter.enqueue(testCat);
        testAnimalShelter.enqueue(testDog1);
        testAnimalShelter.enqueue(testCat1);
        testAnimalShelter.enqueue(testDog2);
        testAnimalShelter.enqueue(testCat2);
        testAnimalShelter.dequeue("cat");
        String expected = "Front --> lab: harold --> husky: ginger --> pitbull: sweetie pie <-- Back\n" +
                "Front --> fat cat: crazy --> regular cat: muffin <-- Back";

        assertEquals(expected,testAnimalShelter.toString());
    }
    @Test
    public void dequeue_BadInput() {
        AnimalShelter testAnimalShelter = new AnimalShelter();
        Dog testDog = new Dog("lab","harold");
        Cat testCat = new Cat("harry cat","fluffy");
        Dog testDog1 = new Dog("husky","ginger");
        Cat testCat1 = new Cat("fat cat","crazy");
        Dog testDog2 = new Dog("pitbull","sweetie pie");
        Cat testCat2 = new Cat("regular cat","muffin");
        testAnimalShelter.enqueue(testDog);
        testAnimalShelter.enqueue(testCat);
        testAnimalShelter.enqueue(testDog1);
        testAnimalShelter.enqueue(testCat1);
        testAnimalShelter.enqueue(testDog2);
        testAnimalShelter.enqueue(testCat2);

        assertEquals(null,testAnimalShelter.dequeue("pig"));
    }
}