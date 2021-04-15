package code.utilities;

import code.tree.Node;
import code.tree.Tree;

public class FizzBuzzTree {

  public static Tree fizzBuzzTree(Tree tree){
      Tree newTree = new Tree();
      newTree.root= _fizzBuzzTree(tree.root);
      return newTree;
  }

  public static Node _fizzBuzzTree(Node<Integer> node){
    if(node==null)return null;
    String value = fizzBuzz(node.value);
    return new Node(
      value,
      _fizzBuzzTree(node.left),
      _fizzBuzzTree(node.right)
    );
  }

  private static String fizzBuzz(Integer n){
    if (n%15==0)return "FizzBuzz";
    if (n%5==0)return "Buzz";
    if (n%3==0)return "Fizz";

    return n.toString();
  }
}
