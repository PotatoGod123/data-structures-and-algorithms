package code.graph;

import java.util.ArrayList;
import java.util.List;

public class  Vertex<T> {
  public T value;
  public List<Edge> edges = new ArrayList<>();

  public Vertex(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Vertex{" +
      "value=" + value +
      '}';
  }
}
