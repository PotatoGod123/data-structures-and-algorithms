package code.tree;

import java.util.ArrayList;

public class Tree<T> {
  public Node<T> root=null;


  public String breadthFirst(){
    //check if the root is null, if it is tree is empty
    System.out.println(this.root);
    if(this.root==null)return "Nothing in the tree";
    // make an array that we will as a deque
    ArrayList<Node> listHolder = new ArrayList<>();
    String str= "";
    //string to be returned
    listHolder.add(root);
    //add the first node into the queue like array

    while (listHolder.size()>0){//checks to see if the array is empty, if it is it's done going through the whole  tree
      Node current = listHolder.remove(0);
      //we remove the first spot of the array to get the first node,
      //takes it's value and add it to the str, the root
      str+=current.value;
      System.out.println(current.value);
      //this will add the next level, which is then reset at the top the next node in the array looping till there is none
      if(current.left!=null) listHolder.add(current.left);
      if(current.right!=null)listHolder.add(current.right);
    }

    System.out.println(str);
    return str;
  }

  public ArrayList<T> preOrder(){
    ArrayList<T> newArray= new ArrayList<>();
    this._preOrder(this.root,newArray);
    return newArray;
  }

  private void _preOrder(Node node, ArrayList array){
    if(node==null) return;
    array.add(node.value);
    System.out.println(node.value);
    this._preOrder(node.left,array);
    this._preOrder(node.right,array);

  }

  public ArrayList<T> inOrder(){
    ArrayList<T> newArray= new ArrayList<>();
    this._inOrder(this.root,newArray);
    return newArray;
  }

  private void _inOrder(Node node, ArrayList array){
    if(node==null) return;

    this._inOrder(node.left,array);
    array.add(node.value);
    System.out.println(node.value);
    this._inOrder(node.right,array);

  }
  public ArrayList<T> postOrder(){
    ArrayList<T> newArray= new ArrayList<>();
    this._postOrder(this.root,newArray);
    return newArray;
  }

  private void _postOrder(Node node, ArrayList array){
    if(node==null) return;

    this._postOrder(node.left,array);
    this._postOrder(node.right,array);
    array.add(node.value);
    System.out.println(node.value);

  }

  public int findMaximunValue(){
    int value= 0;
      return _findMaxinumValue((Node<Integer>) this.root,value);
  }

  private int _findMaxinumValue(Node<Integer> node, int value){
    if(node==null)return value;
    System.out.println(node.value+"This is the node value");
    System.out.println(value+"this is the value");

    if(node.value>value){
      value=node.value;
      System.out.println(value+"this is the value inside the if");
    }

    value= this._findMaxinumValue(node.left,value);

    value=this._findMaxinumValue(node.right,value);

    return value;
  }

}
