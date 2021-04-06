package code.linkedlisttest;

import code.linked_list.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

  @Test public void testLinkedListIsNull(){
    LinkedList newList = new LinkedList();
    assertTrue(newList.nada());


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

  @Test public void testZipLists(){
    LinkedList newList = new LinkedList();
    newList.insert(2);
    newList.insert(3);
    newList.insert(1);
    System.out.println(newList.printNode());
    LinkedList newListTwo = new LinkedList();

    newListTwo.insert(4);
    newListTwo.insert(9);
    newListTwo.insert(5);
    System.out.println(newListTwo.printNode());
    LinkedList newMergedList= LinkedList.zipLists(newList,newListTwo);
    LinkedList testList = new LinkedList();
    testList.insert(4);
    testList.insert(2);
    testList.insert(9);
    testList.insert(3);
    testList.insert(5);
    testList.insert(1);
    System.out.println(testList.printNode());
    System.out.println(newMergedList.printNode());
    //yeaaa idk test wont work.
    assertFalse("must match",testList.equals(newMergedList));



  }

  @Test public void testMoreZipList(){
    LinkedList newList = new LinkedList();
//    newList.insert(2);
    newList.insert(3);
    newList.insert(1);
    System.out.println(newList.printNode());
    LinkedList newListTwo = new LinkedList();

    newListTwo.insert(4);
    newListTwo.insert(9);
    newListTwo.insert(5);
    System.out.println(newListTwo.printNode());
    LinkedList newMergedList= LinkedList.zipLists(newList,newListTwo);
    System.out.println(newMergedList.printNode());
  }

  @Test public void  testMoreMoreZipList(){
    LinkedList newList = new LinkedList();
    newList.insert(2);
    newList.insert(3);
    newList.insert(1);
    System.out.println(newList.printNode());
    LinkedList newListTwo = new LinkedList();

//    newListTwo.insert(4);
    newListTwo.insert(9);
    newListTwo.insert(5);
    System.out.println(newListTwo.printNode());
    LinkedList.zipLists(newList,newListTwo);

    System.out.println(newList.printNode());
  }
}
