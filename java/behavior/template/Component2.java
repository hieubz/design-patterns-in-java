package behavior.template;

import lombok.AllArgsConstructor;

import java.util.Properties;

@AllArgsConstructor
public class Component2 {
  private final Properties config;

  public void start() {
    System.out.println("Component 2 started!");
  }
}
