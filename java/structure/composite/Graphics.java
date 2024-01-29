package structure.composite;

import java.util.ArrayList;
import java.util.List;

/** composite object */
public class Graphics implements Shape {
  // stores child components
  private final List<Shape> children = new ArrayList<>();

  public void addChild(Shape child) {
    children.add(child);
  }

  // implements child-related operations in the Component interface.
  @Override
  public void draw() {
    children.forEach(Shape::draw);
  }
}
