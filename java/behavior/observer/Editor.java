package behavior.observer;

import java.io.File;

/** A concrete publisher. Each time the Editor's object changes, it notifies its subscribers.
 * EmailNotificationListener, LogOpenFileListener react to these events by executing their behaviors.
 */
public class Editor {

  public EventManager eventManager;

  private File file;

  public Editor() {
    String[] eventTypes = new String[] {"open", "save"};
    this.eventManager = new EventManager(eventTypes);
  }

  public void openFile(String filePath) {
    this.file = new File(filePath);
    eventManager.notify("open", file);
  }

  public void saveFile() throws Exception {
    if (this.file != null) {
      eventManager.notify("save", file);
    } else {
      throw new Exception("Please open a file first!");
    }
  }
}
