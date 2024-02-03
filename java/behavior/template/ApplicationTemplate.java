package behavior.template;

import java.io.IOException;
import java.util.Properties;

public class ApplicationTemplate {
  private Component1 component1;
  private Component2 component2;

  // final to avoid overriding by subclasses => keep the same structure for all subclasses
  public final void start() throws IOException {
    final Properties config = readConfig();
    initComponents(config);
    startComponents(component1, component2);
  }

  // protected to allow override
  protected void startComponents(Component1 component1, Component2 component2) {
    component1.start();
    component2.start();
  }

  // protected to allow override
  protected void initComponents(Properties config) {
    component1 = new Component1(config);
    component2 = new Component2(config);
  }

  // protected to allow override
  protected Properties readConfig() throws IOException {
    final Properties config = new Properties();
    config.load(getClass().getResourceAsStream("application.properties"));
    return config;
  }
}
