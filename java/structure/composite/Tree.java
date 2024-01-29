package structure.composite;

/** leaf object */
public class Tree implements Shape {

  @Override
  public void draw() {
    System.out.println("tree");
  }
}
