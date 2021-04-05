package code.stacksandqueues;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue<T> {
  private Node<T> front;//this will point to the beginning
  private Node<T> back;//this will point essentially to the end

  public void enqueue(T value){
    Node<T> newNode = new Node<>(value);//using modified node
    //so if the whole thing is empty, we will set the node to start the whole line
    if(this.isEmpty()){//incase the whole thing is empty we have to set it up so that the front and back are the new node
      //or else the logic and point will not work and an error will be thrown
      front=newNode;
      back=newNode;
      return;
    }
    back.next=newNode;//so the way queue works is everything gets added in the back
    back=newNode;// this is doing that essentially
  }



  public T dequeue(){
    if(this.isEmpty())throw new NoSuchElementException();//as usual check if its empty and throw error
    Node<T> tempHolder = front;//we make a copy of the front of the queue
    front=front.next;//now we re assign
    tempHolder.next=null;// now we  set the temp next to null just to make sure its not attached to anything anymore

    return tempHolder.value;
  }

  public T peek(){
    if(this.isEmpty())throw new NoSuchElementException();//if empty throw error
    return front.value;//if not empty we will send the value of the front of the queue
  }

  public boolean isEmpty(){//this bad boy will check the front and see if its not null, hence it is not empty. but if is, we send back true
    if(front!=null)return false;
    return true;
  }

  @Override
  public String toString() {
    return "Queue{" +
      "front=" + front +
      ", back=" + back +
      '}';
  }
}
