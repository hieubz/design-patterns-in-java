package behavior.memento;

public class Demo {

  public static void main(String[] args) {
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();
    originator.setState("State 1");
    careTaker.pushMemento(originator.createMemento());
    originator.setState("State 2");
    careTaker.pushMemento(originator.createMemento());

    originator.restore(careTaker.popMemento());
    System.out.println(originator.getState());
    originator.restore(careTaker.popMemento());
    System.out.println(originator.getState());
  }
}
