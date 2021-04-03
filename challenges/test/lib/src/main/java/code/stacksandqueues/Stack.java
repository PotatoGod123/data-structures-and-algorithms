package code.stacksandqueues;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
  private Node<T> top; //first time using generic, to use generic just <T>



  public void push(T value){
      this.top = new Node<>(value,this.top);//adds new node to the stack
  }

  public T pop(){
    if(this.top==null)throw new EmptyStackException();//check if it is empty, if is throw an error
    T removedValue= this.top.value;//retrieves value of top node about to be removed
    this.top=this.top.next;//set top/current to the one underneath essentially removing it
    return removedValue;// then return the removed value;

  }


  public T peek(){
    if(this.top==null)throw new EmptyStackException(); //just checking like above
    return this.top.value;//if not empty, return the top value
  }
  public boolean isEmpty(){
    if(top==null)return false;
    return true;
  }
  @Override
  public String toString() {
    return "Stack{" +
      "top=" + this.top +
      '}';
  }

}
