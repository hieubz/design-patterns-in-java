package behavior.template;

import lombok.AllArgsConstructor;

import java.util.Properties;

@AllArgsConstructor
public class Component1 {
  private final Properties config;

  public void start() {
    System.out.println("Component 1 started!");
  }
}
