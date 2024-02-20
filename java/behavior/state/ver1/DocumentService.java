package behavior.state.ver1;

/** Context Class */
public class DocumentService {
  private State state;

  public DocumentService() {
    this.state = new DefaultState();
  }

  public void setState(State state) {
    this.state = state;
  }

  public void process() {
    this.state.process();
  }
}
