package behavior.state.ver2;

public interface State {

  void next(Package pkg);

  void prev(Package pkg);

  void printStatus();
}
