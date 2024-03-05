package structure.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/** Flyweight factory decides whether to reuse existing flyweight or to create a new object */
public class TreeFactory {
  static Map<String, TreeType> treeTypes = new HashMap<>();

  public static TreeType getTreeType(String name, Color color, String texture) {
    return treeTypes.computeIfAbsent(name, k -> new TreeType(name, color, texture));
  }
}
