package code.utilities;

public class Animal {
  String name;
  int count;
  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Animal{" +
      "name='" + name + '\'' +
      ", count=" + count +
      '}';
  }
}
