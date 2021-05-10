package code.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Graph<T> {
  private List<Vertex> vertexes = new ArrayList<>();
  private List<Edge> edges = new ArrayList<>();

  public Vertex addNode(T value){
    Vertex vertex = new Vertex(value);
    this.vertexes.add(vertex);
    return  vertex;
  }

  public void addEdge(Vertex vertex1, Vertex vertex2,int weight){
    if(!this.vertexes.contains(vertex1)||!this.vertexes.contains(vertex2))throw new NoSuchElementException();
    Edge edge = new Edge(vertex1,vertex2);
    edge.setWeight(weight);
    edges.add(edge);
    vertex1.edges.add(edge);
    vertex2.edges.add(edge);
  }

  public List<Vertex> getNodes() {
    return vertexes;
  }

  public List getNeighbors(Vertex vertex){
    if(!vertexes.contains(vertex))throw new NoSuchElementException();
    if(vertexes.size()==1){
      List holder = new ArrayList<>();
      holder.add(new Edge(vertex,vertex));
      return holder;
    }

    return vertex.edges;

  }


  public Integer size(){
    if(vertexes.size()==0) return null;
    return vertexes.size();
  }



}
