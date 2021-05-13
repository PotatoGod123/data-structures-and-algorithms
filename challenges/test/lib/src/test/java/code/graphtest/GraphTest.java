package code.graphtest;

import code.graph.Graph;

import code.graph.Vertex;
import org.junit.Test;

import static code.graph.GetEdge.getEdge;
import static org.junit.Assert.*;

public class GraphTest{
  @Test
  public void testingGraph(){
    Graph<Object> graph = new Graph<>();
    System.out.println(graph.size());
    assertNull(graph.size());
    Vertex<Object> ver1 = graph.addNode(3);
    System.out.println(graph.size());
    assertSame(1,graph.size());
    Vertex<Object> ver2 = graph.addNode("Cool");
    Vertex<Object> ver3 = graph.addNode(132.3);
    graph.addEdge(ver1,ver2,4);
    System.out.println(graph.getNeighbors(ver1));
  }

  @Test
  public void testingBreathGraph(){
    Graph<String> graph = new Graph<>();

    Vertex<String> one = graph.addNode("Pandora");
    Vertex<String> two = graph.addNode("Arendelle");
    Vertex<String> three = graph.addNode("Metroville");
    Vertex<String> four = graph.addNode("Narnia");
    Vertex<String> five = graph.addNode("Naboo");
    Vertex<String> six = graph.addNode("Monstropolis");

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

  @Test
  public void testingGetEdge(){
    Graph<String> graph = new Graph<>();

    Vertex<String> pandora = graph.addNode("Pandora");
    Vertex<String> arendelle = graph.addNode("Arendelle");
    Vertex<String> metroville = graph.addNode("Metroville");
    Vertex<String> narnia = graph.addNode("Narnia");
    Vertex<String> naboo = graph.addNode("Naboo");
    Vertex<String> monstropolis = graph.addNode("Monstropolis");

    graph.addEdge(pandora,arendelle,150);
    graph.addEdge(pandora,metroville,82);
    graph.addEdge(metroville,arendelle,99);
    graph.addEdge(metroville,monstropolis,105);
    graph.addEdge(monstropolis,arendelle,42);
    graph.addEdge(metroville,narnia,37);
    graph.addEdge(metroville,naboo,26);
    graph.addEdge(narnia,naboo,250);
    graph.addEdge(naboo,monstropolis,73);

    String[] strArr1= {"Metroville","Pandora"};
    String[] strArr2={"Arendelle","Monstropolis","Naboo"};
    String[] strArr3={"Naboo","Pandora"};
    String[] strArr4={"Narnia","Arendelle","Naboo"};
    System.out.println(getEdge(graph,strArr1));
    System.out.println(getEdge(graph,strArr2));
    System.out.println(getEdge(graph,strArr3));
    System.out.println(getEdge(graph,strArr4));
  }

  @Test
  public void testingDepthTraversal(){
    Graph<String> graph = new Graph<>();

    Vertex<String> a = graph.addNode("a");
    Vertex<String> b = graph.addNode("b");
    Vertex<String> c = graph.addNode("c");
    Vertex<String> d = graph.addNode("d");
    Vertex<String> e = graph.addNode("e");
    Vertex<String> f = graph.addNode("f");
    Vertex<String> h = graph.addNode("h");
    Vertex<String> g = graph.addNode("g");

    graph.addEdge(a,b,1);
    graph.addEdge(a,d,2);
    graph.addEdge(b,c,3);
    graph.addEdge(c,g,4);
    graph.addEdge(b,d,4);

    graph.addEdge(d,e,5);
    graph.addEdge(d,f,6);
    graph.addEdge(d,h,7);
    graph.addEdge(f,h,8);
    assertEquals("[a, d, h, f, e, b, c, g]",graph.depthFirstTraversal(graph).toString());
    System.out.println(graph.depthFirstTraversal(graph));
  }
}
