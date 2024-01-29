package structure.composite;

/** Client code: manipulates objects in the composition through the Component interface. */
public class Demo {

  public static void main(String[] args) {
    Graphics bigGraphics = new Graphics();

    Graphics smallGraphics = new Graphics();
    smallGraphics.addChild(new Tree());
    smallGraphics.addChild(new Square());

    bigGraphics.addChild(new Line());
    bigGraphics.addChild(new Circle());
    bigGraphics.addChild(new Square());
    bigGraphics.addChild(new Tree());
    bigGraphics.addChild(smallGraphics);

    // Clients treat individual objects and compositions of objects uniformly through interface.
    // Clients normally don't know (and shouldn't care) whether they're dealing with a leaf or a
    // composite component.
    bigGraphics.draw();
  }
}
