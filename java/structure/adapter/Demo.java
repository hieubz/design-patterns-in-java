package structure.adapter;

/** client code collaborates with Target interface */
public class Demo {

  public static void main(String[] args) {
    Target target = new Adapter();
    target.operation();
  }
}
