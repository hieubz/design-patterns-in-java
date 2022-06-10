package creation.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {

  private String value;

  // use volatile to ensure that updates to variables propagate to other threads
  // every read of a volatile variable will be read from the computer's main memory (RAM), not from
  // CPU cache
  // and every write to a volatile variable will be written to main memory (not to CPU cache and
  // flush in a buffer)
  private static volatile ThreadSafeSingleton instance;

  private ThreadSafeSingleton(String value) {
    this.value = value;
  }

  // very slow
  public static synchronized ThreadSafeSingleton getInstance(String value) {
    if (Objects.isNull(instance)) {
      instance = new ThreadSafeSingleton(value);
    }
    return instance;
  }

  // double check
  public static ThreadSafeSingleton getInstanceV2(String value) {
    if (Objects.isNull(instance)) {
      // block
      synchronized (ThreadSafeSingleton.class) {
        // re-check, may be another thread has initialized before
        if (Objects.isNull(instance)) {
          instance = new ThreadSafeSingleton(value);
        }
      }
    }
    return instance;
  }
}
