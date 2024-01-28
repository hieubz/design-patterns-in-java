package creation.abstract_factory;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface/abstract class.
 *
 * This is the common interface for buttons family.
 */
public abstract class Button {

  public abstract void paint();
}
