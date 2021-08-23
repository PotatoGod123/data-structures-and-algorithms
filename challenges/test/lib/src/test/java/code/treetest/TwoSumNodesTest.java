package code.treetest;

import code.tree.Node;
import code.tree.Tree;
import code.tree.TwoSumNodes;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class TwoSumNodesTest {
  Tree<Integer> tree = new Tree();

  @Before
  public void createTree(){


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
  }

  @Test
  public void testingTwoSum(){
    TwoSumNodes twoSumNodes = new TwoSumNodes();
//    System.out.println(tree);
//    System.out.println(twoSumNodes.findTarget(tree.root, 850));
    assertTrue(twoSumNodes.findTarget(tree.root, 850) );
    assertFalse(twoSumNodes.findTarget(tree.root, 1));
  }
}
