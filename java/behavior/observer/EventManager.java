package behavior.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Basic publisher */
public class EventManager {
  Map<String, List<EventListener>> listeners = new HashMap<>();

  public EventManager(String[] operations) {
    for (String operation : operations) {
      this.listeners.put(operation, new ArrayList<>());
    }
  }

  public void subscribe(String eventType, EventListener listener) {
    List<EventListener> users = listeners.get(eventType);
    if (users == null)
      throw new IllegalArgumentException("The eventType " + eventType + " is not supported!");

    users.add(listener);
  }

  public void unsubscribe(String eventType, EventListener listener) {
    List<EventListener> users = listeners.get(eventType);
    if (users == null)
      throw new IllegalArgumentException("The eventType " + eventType + " is not supported!");
    if (users.isEmpty()) throw new IllegalArgumentException("The listener is not found!");
    users.remove(listener);
  }

  public void notify(String eventType, File file) {
    List<EventListener> users = listeners.get(eventType);
    for (EventListener user : users) {
      user.update(eventType, file);
    }
  }
}
