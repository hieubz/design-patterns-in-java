package creation.abstract_factory;

/**
 * All products families have the same varieties (MacOS/Windows).
 * This is another variant of a button.
 */
public class WindowsButton extends Button {

  @Override
  public void paint() {
    System.out.println("You have created WindowsButton.");
  }
}
