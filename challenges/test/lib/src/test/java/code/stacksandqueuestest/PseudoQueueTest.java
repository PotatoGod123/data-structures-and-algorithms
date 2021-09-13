package code.stacksandqueuestest;

import code.stacksandqueues.PseudoQueue;
import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {

  @Test public void testingEnqueue(){
    PseudoQueue pseudoQueueHolder = new PseudoQueue();

    pseudoQueueHolder.enqueue(20);
    pseudoQueueHolder.enqueue(15);
    pseudoQueueHolder.enqueue(10);
    pseudoQueueHolder.enqueue(5);
    System.out.println(pseudoQueueHolder);

    assertEquals("PseudoQueue{firstStack=Stack{top=Node{value=5, next=Node{value=10, next=Node{value=15, next=Node{value=20, next=null}}}}}, secondStack=Stack{top=null}}",
      pseudoQueueHolder.toString());

  }

  @Test public void testingDequeue(){
    PseudoQueue pseudoQueueHolder = new PseudoQueue();

    pseudoQueueHolder.enqueue(20);
    pseudoQueueHolder.enqueue(15);
    pseudoQueueHolder.enqueue(10);
    pseudoQueueHolder.enqueue(5);
    System.out.println(pseudoQueueHolder);
    assertEquals(20,pseudoQueueHolder.dequeue());
    System.out.println(pseudoQueueHolder);
  }
}
