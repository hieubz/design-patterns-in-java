package behavior.visitor;

public class Demo {

  public static void main(String[] args) {
    final Visitor visitor1 = new ConcreteVisitor1();
    final Visitor visitor2 = new ConcreteVisitor2();

    final Element elementA = new ConcreteElementA();
    elementA.accept(visitor1);
    elementA.accept(visitor2);

    final Element elementB = new ConcreteElementB();
    elementB.accept(visitor1);
    elementB.accept(visitor2);
  }
}
