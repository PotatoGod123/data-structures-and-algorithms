package code.treetest;
import code.tree.Node;
import code.tree.Tree;
import org.junit.Test;

import java.util.*;

import static code.tree.TreeIntersection.treeIntersection;
import static org.junit.Assert.*;

public class TreeIntersectionTest {

  @Test
  public void testingTreeIntersection(){
    Tree tree = new Tree();

    tree.root=new Node(150,null,null);
    tree.root.left=new Node(100,null,null);
    tree.root.left.left=new Node(75,null,null);
    tree.root.left.right= new Node(160,null,null);
    tree.root.left.right.left= new Node(125,null,null);
    tree.root.left.right.right= new Node(175,null,null);
    tree.root.right = new Node(250,null,null);
    tree.root.right.left = new Node(200,null,null);
    tree.root.right.right = new Node(350,null,null);
    tree.root.right.right.left = new Node(300,null,null);
    tree.root.right.right.right = new Node(500,null,null);

    Tree treeTwo = new Tree();

    treeTwo.root = new Node(42,null,null);
    treeTwo.root.left = new Node(100,null,null);
    treeTwo.root.left.left = new Node(15,null,null);
    treeTwo.root.left.right = new Node(160,null,null);
    treeTwo.root.left.right.left = new Node(125,null,null);
    treeTwo.root.left.right.right = new Node(175,null,null);
    treeTwo.root.right = new Node(600,null,null);
    treeTwo.root.right.left = new Node(200,null,null);
    treeTwo.root.right.right = new Node(350,null,null);
    treeTwo.root.right.right.left = new Node(4,null,null);
    treeTwo.root.right.right.right = new Node(500,null,null);
    Set setHolder = treeIntersection(tree,treeTwo);
    List arrHolder = new ArrayList<>();

    arrHolder.add(160);
    arrHolder.add(100);
    arrHolder.add(500);
    arrHolder.add(200);
    arrHolder.add(125);
    arrHolder.add(350);
    arrHolder.add(175);
    int count=0;
    for(Object value: setHolder){
      System.out.println(value);
      assertEquals(arrHolder.get(count),value);
      count++;
    }

    assertEquals(7,setHolder.size());

  }
}
