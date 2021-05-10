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

  @Test
  public void testingBreathGraph(){
    Graph graph = new Graph();

    Vertex one = graph.addNode("Pandora");
    Vertex two = graph.addNode("Arendelle");
    Vertex three = graph.addNode("Metroville");
    Vertex four = graph.addNode("Narnia");
    Vertex five = graph.addNode("Naboo");
    Vertex six = graph.addNode("Monstropolis");

    graph.addEdge(one,two,3);
    graph.addEdge(two,three,4);
    graph.addEdge(two,six,3);
    graph.addEdge(three,six,5);
    graph.addEdge(three,four,3);
    graph.addEdge(three,five,5);
    graph.addEdge(four,five,243);
    graph.addEdge(six,five,43);
    String string1 = "[Vertex{value=Metroville}, Vertex{value=Arendelle}, Vertex{value=Monstropolis}, Vertex{value=Narnia}, Vertex{value=Naboo}, Vertex{value=Pandora}]";
    assertEquals(string1,graph.breathFirstTraversal(three).toString());
    String string2 = "[Vertex{value=Pandora}, Vertex{value=Arendelle}, Vertex{value=Metroville}, Vertex{value=Monstropolis}, Vertex{value=Narnia}, Vertex{value=Naboo}]";
    assertEquals(string2,graph.breathFirstTraversal(one).toString());
    String string3="[Vertex{value=Monstropolis}, Vertex{value=Arendelle}, Vertex{value=Metroville}, Vertex{value=Naboo}, Vertex{value=Pandora}, Vertex{value=Narnia}]";
    assertEquals(string3, graph.breathFirstTraversal(six).toString());
    System.out.println(graph.breathFirstTraversal(one).toString());
  }
}