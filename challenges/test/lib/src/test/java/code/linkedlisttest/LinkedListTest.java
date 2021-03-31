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

  @Test public void testFirstNodeIsHead(){
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);

    assertEquals(3,newList.firstNode());
  }

  @Test public void testAppend(){
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);

    System.out.println(newList.printNode());

    newList.append(4);
    System.out.println(newList.printNode());

    assertEquals(true,newList.includes(4));

  }

  @Test public void testInsertBefore(){
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);

    System.out.println(newList.printNode());

    newList.append(4);
    System.out.println(newList.printNode());

    newList.insertBefore(5,4);
    System.out.println(newList.printNode());
    assertEquals(true,newList.includes(5));

  }

  @Test public void testInsertAfter(){
    LinkedList newList = new LinkedList();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);

    newList.append(4);
    System.out.println(newList.printNode());
    newList.insertBefore(5,4);
    System.out.println(newList.printNode());

    newList.insertAfter(6,6);
    System.out.println(newList.printNode());

    assertEquals(false,newList.includes(6));

  }

  @Test public void testKFromTheEnd() throws Exception {
    LinkedList newList = new LinkedList();
    newList.insert(8);
    newList.insert(3);
    newList.insert(1);

    newList.append(2);
    System.out.println(newList.printNode());
    //this throws an error if given int is bigger than LL
//    System.out.println(newList.kFromTheEnd(6));

    assertEquals(2, newList.kFromTheEnd(0));
    assertEquals(3, newList.kFromTheEnd(2));

  }

}
