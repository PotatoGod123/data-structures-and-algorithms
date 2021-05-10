package code.graphtest;

import code.graph.Graph;
import org.junit.Test;

public class GraphTest {
  @Test
  public void testingGraph(){
    Graph graph = new Graph();
    System.out.println(graph.size());
    graph.addNode(3);
    System.out.println(graph.size());


  }
}
