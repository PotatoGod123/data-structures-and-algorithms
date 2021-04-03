package code.stacksandqueues;

public class Node<T> {
  T value;
  Node<T> next=null;

  public  Node(T value,Node<T> next) {
    this.value = value;
    this.next = next;
  }

  //needed a new one for queuesss
  public  Node(T value) {
    this.value=value;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", next=" + next +
      '}';
  }
}
