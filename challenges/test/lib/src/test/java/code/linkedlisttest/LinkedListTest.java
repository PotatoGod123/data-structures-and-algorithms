package code.linkedlisttest;

import code.linked_list.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

  @Test public void testLinkedListIsNull(){
    LinkedList newList = new LinkedList();
    assertEquals(true,newList.nada());


  }

  @Test public void testInsertProperly(){
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);

    System.out.println(newList.printNode());

    assertEquals("3, 2, 1, null",newList.printNode());

  }

  @Test public void testRecursion(){
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);

    System.out.println(newList.toString());
  }

  @Test public void testIncludes(){
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);

    assertEquals(true,newList.includes(2));
  }

  @Test public void firstNodeIsHead(){
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);

    assertEquals(3,newList.firstNode());
  }
}
