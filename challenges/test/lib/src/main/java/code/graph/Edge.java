package code.graph;

public class Edge {
  private Vertex vertexOne;
  private Vertex vertexTwo;
  private int weight;

  public Edge(Vertex vertexOne, Vertex vertexTwo) {
    this.vertexOne = vertexOne;
    this.vertexTwo = vertexTwo;
  }

  public Vertex getVertexOne() {
    return vertexOne;
  }

  public void setVertexOne(Vertex vertexOne) {
    this.vertexOne = vertexOne;
  }

  public Vertex getVertexTwo() {
    return vertexTwo;
  }

  public void setVertexTwo(Vertex vertexTwo) {
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
