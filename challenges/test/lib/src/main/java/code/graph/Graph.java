package code.graph;

import code.stacksandqueues.Queue;

import java.util.*;

public class Graph<T> {
  private List<Vertex<T>> vertexes = new ArrayList<>();
  private List<Edge> edges = new ArrayList<>();

  public Vertex<T> addNode(T value){
    Vertex<T> vertex = new Vertex<>(value);
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

  public List<Vertex<T>> getNodes() {
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

  public List breathFirstTraversal(Vertex startingNode){
    Queue<Vertex> q = new Queue<>();
    q.enqueue(startingNode);
    List<Vertex> s = new ArrayList<>();
    s.add(startingNode);

    while(!q.isEmpty()){
      Vertex current = q.dequeue();
      for(Object e:current.edges){
        Edge eHolder = ((Edge) e);
        if(!s.contains(eHolder.vertexTwo)){
          q.enqueue(eHolder.vertexTwo);
          s.add(eHolder.vertexTwo);
        }
        if(!s.contains(eHolder.vertexOne)){
          q.enqueue(eHolder.vertexOne);
          s.add(eHolder.vertexOne);
        }

      }

    }
    return s;
  }

}
