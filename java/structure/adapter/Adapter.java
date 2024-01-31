package structure.adapter;

/** implements Target interface and adapts the interface of Adaptee to the Target interface */
public class Adapter implements Target {
  // can use DI if it's in Spring Boot app
  private final Adaptee adaptee = new Adaptee();

  @Override
  public void operation() {
    adaptee.specificOperation();
  }
}
