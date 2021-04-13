package code.treetest;

import code.tree.BinarySearchTree;
import code.tree.Node;
import code.tree.Tree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TreeTest {
  Tree tree = new Tree();

  @Before
  public void createTree(){

    tree.root = new Node<>('h', null, null);
    tree.root.left = new Node<>('f', null, null);
    tree.root.left.left = new Node<>('c', null, null);
    tree.root.left.left.left = new Node<>('a', null, null);
    tree.root.left.left.right = new Node<>('d', null, null);
    tree.root.left.right = new Node<>('g', null, null);
    tree.root.right = new Node<>('n', null, null);
    tree.root.right.right = new Node<>('p', null, null);
    tree.root.right.left = new Node<>('j', null, null);
    tree.root.right.left.left = new Node<>('i', null, null);
    tree.root.right.left.right = new Node<>('k', null, null);
    tree.root.right.left.right.right = new Node<>('m', null, null);
    tree.root.right.left.right.right.left = new Node<>('l', null, null);


  }


  @Test
  public void testTree(){
   //    System.out.println(tree.breadthFirst());

    assertEquals("hfncgjpadikml",tree.breadthFirst());
  }

  @Test
  public void testPreOrder(){


    ArrayList<Character> stringArr = new ArrayList<>();
    stringArr.add('h');
    stringArr.add('f');
    stringArr.add('c');
    stringArr.add('a');
    stringArr.add('d');
    stringArr.add('g');
    stringArr.add('n');
    stringArr.add('j');
    stringArr.add('i');
    stringArr.add('k');
    stringArr.add('m');
    stringArr.add('l');
    stringArr.add('p');

    ArrayList<String> holder = tree.preOrder();
    System.out.println(holder);
    System.out.println(stringArr);
    int counter =0;

    for(char a:stringArr){
     assertEquals(a,holder.get(counter));
      counter++;
    }
  }
  @Test
  public void inOrder(){
    System.out.println(tree.inOrder());
    ArrayList<Character> stringArr = new ArrayList<>();
    stringArr.add('h');
    stringArr.add('f');
    stringArr.add('c');
    stringArr.add('a');
    stringArr.add('d');
    stringArr.add('g');
    stringArr.add('n');
    stringArr.add('j');
    stringArr.add('i');
    stringArr.add('k');
    stringArr.add('m');
    stringArr.add('l');
    stringArr.add('p');

    Collections.sort(stringArr);
    assertArrayEquals(stringArr.toArray(),tree.inOrder().toArray());
  }

  @Test
  public void postOrder(){
    System.out.println(tree.postOrder());
    ArrayList<Character> stringArr = new ArrayList<>();
    stringArr.add('a');
    stringArr.add('d');
    stringArr.add('c');
    stringArr.add('g');
    stringArr.add('f');
    stringArr.add('i');
    stringArr.add('l');
    stringArr.add('m');
    stringArr.add('k');
    stringArr.add('j');
    stringArr.add('p');
    stringArr.add('n');
    stringArr.add('h');

    assertArrayEquals(stringArr.toArray(),tree.postOrder().toArray());
  }

  @Test
  public void binarySearchTreeTest(){
    BinarySearchTree searchTree = new BinarySearchTree();

    searchTree.add(10);
    searchTree.add(4);
    searchTree.add(143);
    searchTree.add(2);
    searchTree.add(1);
    searchTree.add(3);
    System.out.println(searchTree.toString());
    searchTree.add(5);
    searchTree.add(6);
    searchTree.add(7);
    searchTree.add(12143);
    searchTree.add(1234214214);
    System.out.println(searchTree.contains(121430));

    assertTrue(searchTree.contains(7));
    assertFalse(searchTree.contains(-4));
    System.out.println(searchTree.breadthFirst());
  }

  @Test public void treeMaxinumValueTest(){
    Tree newTree = new Tree();
    Node a = new Node(2);
    Node b = new Node(7);
    Node c = new Node(5);
    Node d = new Node(2);
    Node e = new Node(6);
    Node f = new Node(5);
    Node g = new Node(11);
    Node h = new Node(9);
    Node i = new Node(4);
//    Node j = new Node(2);
    Node k = new Node(5);

    newTree.root=a;

    a.left=b;
    b.left=d;
    b.right=e;
    e.left=f;
    e.right=g;

    a.right=k;
    k.right=h;
    h.left=i;
    i.right=new Node(144);

    System.out.println(newTree.findMaximunValue());
    f.left=new Node(1234);

    assertEquals(1234,newTree.findMaximunValue());
  }
}
