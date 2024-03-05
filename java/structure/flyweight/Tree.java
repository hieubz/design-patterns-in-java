package structure.flyweight;

import lombok.AllArgsConstructor;

import java.awt.*;

/**
 * The contextual objects contains the extrinsic states (x, y). An application can create billions
 * of these since they are pretty small: just two integer coordinates and one reference field.
 */
@AllArgsConstructor
public class Tree {
  private int x;
  private int y;
  private TreeType type;

  public void draw(Graphics g) {
    type.draw(g, x, y);
  }
}
