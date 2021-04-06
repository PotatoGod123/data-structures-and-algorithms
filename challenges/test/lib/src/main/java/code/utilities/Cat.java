package code.utilities;

public class Cat extends Animal{
  String species="Cat";

  public Cat(String name) {
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
    return "Cat{" +
      "name='" + name + '\'' +
      ", species='" + species + '\'' +
      '}';
  }
}
