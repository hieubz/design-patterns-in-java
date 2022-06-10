package creation.singleton;

import java.util.Objects;

public class LazyInitializedSingleton {

  private String value;

  // set a private static instance var
  private static LazyInitializedSingleton instance;

  // private constructor
  private LazyInitializedSingleton(String value) {
    this.value = value;
  }

  public static LazyInitializedSingleton getInstance(String value) {
    if (Objects.isNull(instance)) {
      instance = new LazyInitializedSingleton(value);
    }
    return instance;
  }

  public static void main(String[] args) {
    LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance("A");
    LazyInitializedSingleton singleton2 = LazyInitializedSingleton.getInstance("B");
    System.out.println(singleton2.value);
    System.out.println(singleton.value);
  }
}
