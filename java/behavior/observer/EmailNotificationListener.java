package behavior.observer;

import java.io.File;

/** Concrete listener: sends email upon receiving notification */
public class EmailNotificationListener implements EventListener {
  private String email;

  public EmailNotificationListener(String email) {
    this.email = email;
  }

  @Override
  public void update(String eventType, File file) {
    System.out.println(
        "Email to "
            + email
            + ": Someone has performed "
            + eventType
            + "operation for the file "
            + file.getName());
  }
}
