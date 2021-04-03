package code.stacksandqueues;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue<T> {
  private Node<T> front;//this will point to the begnning
  private Node<T> back;//this will point essentially to the end

  public void enqueue(T value){
    Node<T> newNode = new Node<>(value);//using modified node
    //so if the whole thing is empty, we will set the node to start the whole line
    if(this.isEmpty()){
      front=newNode;
      back=newNode;
      return;
    }
    back.next=newNode;//so the way queue works is everything gets added in the back
    back=newNode;// this is doing that essentially
  }



  public T dequeue(){
    if(front==null)throw new NoSuchElementException();
    Node<T> tempHolder = front;
    front=front.next;
    tempHolder.next=null;

    return tempHolder.value;
  }

  public T peek(){
    if(front==null)throw new NoSuchElementException();//if empty throw eeor
    return front.value;//so queue
  }

  public boolean isEmpty(){
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
