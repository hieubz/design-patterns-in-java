package behavior.observer;

import java.io.File;
import java.time.LocalDateTime;

/** Concrete listener: Writes a message to a log file upon receiving notification */
public class LogOpenFileListener implements EventListener {
  private File log;

  public LogOpenFileListener(String fileName) {
    this.log = new File(fileName);
  }

  @Override
  public void update(String eventType, File file) {
    System.out.printf(
        "Save to log %s: Someone has performed %s operation with the following file %s at %s\n",
        log, eventType, file.getName(), LocalDateTime.now());
  }
}
