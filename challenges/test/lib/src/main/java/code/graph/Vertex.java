package code.graph;

import java.util.ArrayList;
import java.util.List;

public class  Vertex<T> {
  T value;
  List edges = new ArrayList();

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
