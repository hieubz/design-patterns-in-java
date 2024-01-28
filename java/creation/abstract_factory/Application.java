package creation.abstract_factory;

/**
 * Here is our client code.
 * Factory users don't care which concrete factory they use since they work with factories and
 * products through abstract interfaces.
 */
public class Application {
  private final Button button;
  private final CheckBox checkBox;

  public Application(GUIFactory factory) {
    this.button = factory.createButton();
    this.checkBox = factory.createCheckbox();
  }

  public static Application run() {
    Application app;
    GUIFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.equals("mac")) {
      factory = new MacOSFactory();
    } else {
      factory = new WindowsFactory();
    }
    app = new Application(factory);
    return app;
  }

  public void paint() {
    button.paint();
    checkBox.paint();
  }
}
