package creation.abstract_factory;

/**
 * Each concrete factory extends basic factory and responsible for creating products of a single
 * variety.
 */
public class MacOSFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public CheckBox createCheckbox() {
    return new MacOSCheckbox();
  }
}
