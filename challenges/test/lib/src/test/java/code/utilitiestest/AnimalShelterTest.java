package code.utilitiestest;

import code.utilities.AnimalShelter;
import code.utilities.Cat;
import code.utilities.Dog;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {

  @Test public void testAnimalShelter(){
    AnimalShelter testSheleter = new AnimalShelter();
    Dog dogTest = new Dog("Pupper");
    Cat catTest = new Cat("Catty");
    Dog dogTest2 = new Dog("PupperTwo");
    Cat catTest2 = new Cat("CattyTwo");
    Dog dogTest3 = new Dog("PupperThree");
    Cat catTest3 = new Cat("CattyThree");
    testSheleter.enqueue(dogTest);
    testSheleter.enqueue(catTest);
    testSheleter.enqueue(dogTest2);
    testSheleter.enqueue(catTest2);
    testSheleter.enqueue(dogTest3);
    testSheleter.enqueue(catTest3);
    System.out.println(testSheleter);

    System.out.println(testSheleter.dequeue("DOG"));
    System.out.println(testSheleter);

    assertNull(testSheleter.dequeue("lol"));

  }
}
