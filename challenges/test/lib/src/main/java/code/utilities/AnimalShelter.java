package code.utilities;

import code.stacksandqueues.Queue;

import java.util.Locale;

public class  AnimalShelter<T> {
  Queue<T> dogs = new Queue<T>();
  Queue<T> cats = new Queue<T>();
  int counter=0;

  public void enqueue(T animal){
    if(animal instanceof Dog){
      ((Dog) animal).count=counter;
      counter++;
      dogs.enqueue(animal);
      System.out.println(((Dog) animal).name+" the dog has been added to the shelter");
    }else if(animal instanceof Cat){
      ((Cat) animal).count=counter;
      counter++;
      cats.enqueue(animal);
      System.out.println(((Cat) animal).name+" the Cat has been added to the shelter");
    }
  }

  public T dequeue(String pref){
    String lowered= pref.toLowerCase(Locale.ROOT);

    if(lowered.equals("dog")){
      return dogs.dequeue();
    }else if(lowered.equals("cat")){
      return cats.dequeue();
    }else{
      return null;
    }

  }

  @Override
  public String toString() {
    return "AnimalShelter{" +
      "dogs=" + dogs +
      ", cats=" + cats +
      '}';
  }
}
