package structure.decorator;

/** Common data interface, which defines read and write operations */
public interface DataSource {

  void writeData(String data);

  String readData();
}
