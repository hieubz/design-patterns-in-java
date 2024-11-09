package creation.factory_method.method;

public class Demo {

  private static Dialog dialog;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  private static void runBusinessLogic() {
    dialog.render();
  }

  /**
   * The concrete factory is usually chosen by clients depending on configuration/setup
   */
  private static void configure() {
    if (System.getProperty("os.name").startsWith("Windows")) {
      dialog = new WindowsDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }
}
