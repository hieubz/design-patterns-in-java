package creation.factory_method.method;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It should have some core
 * business logic which needs different products to be created.
 */
public abstract class Dialog {

  // factory method
  abstract Button createButton();

  public void render() {
    Button okButton = createButton();
    // business logic...
  }
}
