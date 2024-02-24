package structure.decorator;

import lombok.AllArgsConstructor;

import java.io.*;

/** Simple data reader-writer - original object */
@AllArgsConstructor
public class FileDataSource implements DataSource {
  private String name;

  @Override
  public void writeData(String data) {
    File file = new File(name);
    try (OutputStream fos = new FileOutputStream(file)) {
      fos.write(data.getBytes(), 0, data.length());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public String readData() {
    char[] buffer = null;
    File file = new File(name);
    try (FileReader reader = new FileReader(file)) {
      buffer = new char[(int) file.length()];
      reader.read(buffer);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return buffer != null ? new String(buffer) : "";
  }
}
