package code.tree;

public class Node<T> {
  public T value;
  public Node<T> left;
  public Node<T> right;

  public Node(T value) {
    this.value = value;
    this.left=null;
    this.right=null;
  }

  public Node(T value, Node<T> left, Node<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", left=" + left +
      ", right=" + right +
      '}';
  }
}
