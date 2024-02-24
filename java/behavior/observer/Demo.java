package behavior.observer;

public class Demo {
  public static void main(String[] args) {
    Editor editor = new Editor();
    editor.eventManager.subscribe("open", new LogOpenFileListener("/path/to/log/file.txt"));
    editor.eventManager.subscribe("save", new EmailNotificationListener("phamduyhieuit@gmail.com"));

    try {
      editor.openFile("test.txt");
      editor.saveFile();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
