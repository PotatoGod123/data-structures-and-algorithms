package code.graph;

import code.stacksandqueues.Queue;

import java.util.Arrays;
import java.util.List;

public class GetEdge {

  public static TripObject getEdge(Graph graph, String[] cities){
    TripObject o = new TripObject();
    o.possible=false;
    o.price="$0";
    if(graph.size()==null||graph.size()==1||cities.length==0){
      return  o;
    }
    List<Vertex> list = graph.getNodes();
    Vertex head=null;
    for(Vertex<String> v : list){
      if(v.value.contains(cities[0])){
        head=v;
      }
    }
    if(head==null){
      return o;
    }
    int price = 0;
    for(int i =1;i<cities.length;i++){
      String nextCity = cities[i];
      for(Object ver: head.edges){
        Edge e = ((Edge)ver);
        if(e.vertexTwo.value.toString().contains(nextCity)){
          o.possible=true;
          price+=e.weight;
          head=e.vertexTwo;
          break;
        }
        if(e.vertexOne.value.toString().contains(nextCity)){
          o.possible=true;
          price+=e.weight;
          head=e.vertexOne;
          break;
        }

      }
      if(!o.possible)return o;
    }
    o.price=String.format("$%d",price);
    return o;

  }
}

class TripObject{
  boolean possible;
  String price;

  @Override
  public String toString() {
    return "TripObject{" +
      "possible=" + possible +
      ", price='" + price + '\'' +
      '}';
  }
}
