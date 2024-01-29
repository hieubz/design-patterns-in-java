package structure.composite;

/** leaf object */
public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("circle");
  }
}
