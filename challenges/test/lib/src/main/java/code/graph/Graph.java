package code.graph;

import code.stacksandqueues.Queue;
import org.checkerframework.checker.units.qual.A;

import java.util.*;

public class Graph<T> {
  private final List<Vertex<T>> vertexes = new ArrayList<>();
  private final List<Edge<T>> edges = new ArrayList<>();

  public Vertex<T> addNode(T value){
    Vertex<T> vertex = new Vertex<>(value);
    this.vertexes.add(vertex);
    return  vertex;
  }

  public void addEdge(Vertex<T> vertex1, Vertex<T> vertex2,int weight){
    if(!this.vertexes.contains(vertex1)||!this.vertexes.contains(vertex2))throw new NoSuchElementException();
    Edge<T> edge = new Edge<>(vertex1,vertex2);
    edge.setWeight(weight);
    edges.add(edge);
    vertex1.edges.add(edge);
    vertex2.edges.add(edge);
  }

  public List<Vertex<T>> getNodes() {
    return vertexes;
  }

  public List<Edge<T>> getNeighbors(Vertex<T> vertex){
    if(!vertexes.contains(vertex))throw new NoSuchElementException();
    if(vertexes.size()==1){
      List<Edge<T>> holder = new ArrayList<>();
      holder.add(new Edge<>(vertex,vertex));
      return holder;
    }

    return vertex.edges;

  }

  public Integer size(){
    if(vertexes.size()==0) return null;
    return vertexes.size();
  }

  public Iterable<Vertex<T>> breathFirstTraversal(Vertex<T> startingNode){
    Queue<Vertex<T>> q = new Queue<>();
    q.enqueue(startingNode);
    Set<Vertex<T>> s = new LinkedHashSet<>();
    s.add(startingNode);

    while(!q.isEmpty()){
      Vertex<T> current = q.dequeue();
      for(Edge<T> e:current.edges){

        if(!s.contains(e.vertexTwo)){
          q.enqueue(e.vertexTwo);
          s.add(e.vertexTwo);
        }
        if(!s.contains(e.vertexOne)){
          q.enqueue(e.vertexOne);
          s.add(e.vertexOne);
        }

      }

    }
    return s;
  }

  public Iterable<T> depthFirstTraversal(Graph<T> graph){
    Stack<Vertex<T>> stack = new Stack<>();
    Vertex<T> root = graph.getNodes().get(0);
    stack.push(root);
    HashSet<Vertex<T>> s = new HashSet<>();
    List<T> r = new ArrayList<>();
    s.add(root);
    while(!stack.isEmpty()){
      Vertex<T> current = stack.pop();
      r.add(current.value);
      for(Edge<T> e:current.edges){

        if(!s.contains(e.vertexTwo)){
          System.out.println(e.vertexTwo.value);
          stack.push(e.vertexTwo);
          s.add(e.vertexTwo);
        }
        if(!s.contains(e.vertexOne)){
          System.out.println(e.vertexOne.value);
          stack.push(e.vertexOne);
          s.add(e.vertexOne);
        }

      }

    }
    return r;
  }

}
