package structure.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Tree and the Forest classes are the flyweight's clients. You can merge them if you don't plan
 * to develop the Tree class any further.
 */
public class Forest extends JFrame {
  private List<Tree> trees = new ArrayList<>();

  public void plantTree(int x, int y, String name, Color color, String texture) {
    // reuse flyweight object
    TreeType type = TreeFactory.getTreeType(name, color, texture);
    // create contextual object
    Tree tree = new Tree(x, y, type);
    trees.add(tree);
  }

  @Override
  public void paint(Graphics graphics) {
    for (Tree tree : trees) {
      tree.draw(graphics);
    }
  }
}
