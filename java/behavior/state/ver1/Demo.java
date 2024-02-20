package behavior.state.ver1;

public class Demo {

  public static void main(String[] args) {
    DocumentService service = new DocumentService();
    service.process();

    service.setState(new NewState());
    service.process();

    service.setState(new SubmittedState());
    service.process();

    service.setState(new ApprovedState());
    service.process();
  }
}
