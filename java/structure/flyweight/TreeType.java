package structure.flyweight;

import lombok.AllArgsConstructor;

import java.awt.*;

/**
 * The Flyweight class contains intrinsic states. These states will be shared between many trees. So
 * we extract them into a separate object which lots of individual tree objects can reference
 */
@AllArgsConstructor
public class TreeType {
  private String name;
  private Color color;
  private String texture;

  public void draw(Graphics g, int x, int y) {
    g.setColor(Color.BLACK);
    g.fillRect(x - 1, y, 3, 5);
    g.setColor(color);
    g.fillOval(x - 5, y - 10, 10, 10);
  }
}
