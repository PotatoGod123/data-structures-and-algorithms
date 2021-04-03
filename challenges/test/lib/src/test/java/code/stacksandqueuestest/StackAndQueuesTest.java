package code.stacksandqueuestest;

import code.stacksandqueues.Queue;
import code.stacksandqueues.Stack;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackAndQueuesTest {

  @Test public void testingActualInstances(){
    Stack newStack = new Stack();

    System.out.println(newStack);

    //new way to test throws
    assertThrows(RuntimeException.class, newStack::peek);
  }

  @Test public void testingPeekPush(){
    Stack newStack = new Stack();

    newStack.push(3);
    newStack.push(63);
    newStack.push("StringHelloWorld");

    System.out.println(newStack.peek());
    assertEquals("StringHelloWorld",newStack.peek());

  }

  @Test public void testingPop(){
    Stack newStack = new Stack();

    newStack.push(3);
    newStack.push(63);
    newStack.push("String");

    assertEquals("String",newStack.pop());
  }

  @Test public void testingQueues(){
    Queue newQueue = new Queue();

    System.out.println(newQueue.isEmpty());
    assertTrue(newQueue.isEmpty());

  }

  @Test public void testEnqueue(){
    Queue newQueue = new Queue();

    newQueue.enqueue(12);
    newQueue.enqueue(42);
    newQueue.enqueue(2);
    newQueue.enqueue("stringepic");
    System.out.println(newQueue.peek());
    assertEquals(12,newQueue.peek());

  }

  @Test public void testDequeue(){
    Queue newQueue = new Queue();

    newQueue.enqueue(12);
    newQueue.enqueue(42);
    newQueue.enqueue(2);
    newQueue.enqueue("stringepic");
    System.out.println(newQueue);
    System.out.println(newQueue.dequeue());
    System.out.println(newQueue);
  }
}
