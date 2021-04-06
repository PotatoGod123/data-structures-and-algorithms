package code.utilities;

public class Dog extends Animal{
  String species = "Dog";

  public Dog(String name) {
    super(name);
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  @Override
  public String toString() {
    return "Dog{" +
      "name='" + name + '\'' +
      ", species='" + species + '\'' +
      '}';
  }
}
