package code.tree;

import code.stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> extends Tree<T>{
  Node<T> root=null;



  public void add(T value){
    if(root==null){ this.root= new Node<>(value,null,null); return; }

    Node current= this.root;
    while (true){
      if(value.compareTo((T) current.value)<0){
        if(current.left==null){
          current.left= new Node<>(value,null,null);
          return;
        }
        current=current.left;
      }else if(value==current.value){return;}
      else {
        if(current.right==null){
          current.right= new Node(value,null,null);
        }
        current=current.right;
      }
    }

  }

  public boolean contains(T value){
    if(this.root==null)return false;
    Node current= root;
    System.out.println(current.right.value);
    while (true){
      if (value.compareTo((T)current.value)==0){
        return true;
      } else if(value.compareTo((T)current.value)<0){
        if(current.left==null) {
          System.out.println("143 left");
          return false;
        }
        current=current.left;
      }else {
          if(current.right==null){
            System.out.println("143 right");
            return false;
          }
          current=current.right;
      }
    }

  }

  public ArrayList<T> breadthFirstBinaryTree(){
    if(this.root==null) throw  new Error("Empty tree");

    Queue<Node> queue = new Queue<>();
    ArrayList arrayList = new ArrayList();
    queue.enqueue(this.root);

    while (!queue.isEmpty()){
      Node current = queue.dequeue();

      arrayList.add(current.value);

      if(current.left!=null) queue.enqueue(current.left);
      if(current.right!=null) queue.enqueue(current.right);

    }

    return arrayList;
  }

  public Node<T> getRoot() {
    return root;
  }

  public void setRoot(Node<T> root) {
    this.root = root;
  }

  @Override
  public String toString() {
    return "BinarySearchTree{" +
      "root=" + root +
      '}';
  }
}
