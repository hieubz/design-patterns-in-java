package structure.composite;

/** leaf object */
public class Line implements Shape {

  @Override
  public void draw() {
    System.out.println("line");
  }
}
