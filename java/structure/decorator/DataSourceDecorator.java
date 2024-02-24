package structure.decorator;

import lombok.AllArgsConstructor;

/** Abstract base decorator with default methods */
@AllArgsConstructor
public class DataSourceDecorator implements DataSource {
  private DataSource wrappee;

  @Override
  public void writeData(String data) {
    wrappee.writeData(data);
  }

  @Override
  public String readData() {
    return wrappee.readData();
  }
}
