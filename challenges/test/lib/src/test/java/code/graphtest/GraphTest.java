package code.graphtest;

import code.graph.Graph;
import code.graph.Vertex;
import org.junit.Test;
import static org.junit.Assert.*;

public class GraphTest {
  @Test
  public void testingGraph(){
    Graph graph = new Graph();
    System.out.println(graph.size());
    assertNull(graph.size());
    Vertex ver1 = graph.addNode(3);
    System.out.println(graph.size());
    assertSame(1,graph.size());
    Vertex ver2 = graph.addNode("Cool");
    Vertex ver3 = graph.addNode(132.3);
    graph.addEdge(ver1,ver2,4);
    System.out.println(graph.getNeighbors(ver1));
  }
}
