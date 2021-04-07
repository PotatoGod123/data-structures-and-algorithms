package code.stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
  Stack<T> firstStack = new Stack<>();
  Stack<T> secondStack = new Stack<>();

  public void enqueue(T value){
    firstStack.push(value);
  }

  public T dequeue(){
    if(firstStack.isEmpty() && secondStack.isEmpty())throw new NoSuchElementException();

    while (!firstStack.isEmpty()){
      System.out.println("test");
      secondStack.push(firstStack.pop());
    }
    T temp= secondStack.pop();

    while (!secondStack.isEmpty()){
      firstStack.push(secondStack.pop());
    }

    return temp;
  }

  @Override
  public String toString() {
    return "PseudoQueue{" +
      "firstStack=" + firstStack.toString() +
      ", secondStack=" + secondStack.toString() +
      '}';
  }
}
