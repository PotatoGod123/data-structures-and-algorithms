package code.graph;

public class Edge<T> {
  public Vertex<T> vertexOne;
  public Vertex<T> vertexTwo;
  public int weight;

  public Edge(Vertex<T> vertexOne, Vertex<T> vertexTwo) {
    this.vertexOne = vertexOne;
    this.vertexTwo = vertexTwo;
  }

  public Vertex<T> getVertexOne() {
    return vertexOne;
  }

  public void setVertexOne(Vertex<T> vertexOne) {
    this.vertexOne = vertexOne;
  }

  public Vertex<T> getVertexTwo() {
    return vertexTwo;
  }

  public void setVertexTwo(Vertex<T> vertexTwo) {
    this.vertexTwo = vertexTwo;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Edge{" +
      "vertexOne=" + vertexOne +
      ", vertexTwo=" + vertexTwo +
      ", weight=" + weight +
      '}';
  }
}
