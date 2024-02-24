package structure.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {

  public static void main(String[] args) throws FileNotFoundException {
    String filePath = "demo.txt";
    String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

    // decorate the FileDataSource with encryption and compression
    DataSourceDecorator encodedData =
        new EncryptionDecorator(new CompressionDecorator(new FileDataSource(filePath)));
    // to write encrypted and compressed data, or read the data as original source
    encodedData.writeData(salaryRecords);

    // to read encrypted and compressed data
    DataSource plainData = new FileDataSource(filePath);

    System.out.println("- Input -----------");
    System.out.println(salaryRecords);
    System.out.println("- Encoded ---------");
    System.out.println(plainData.readData());
    System.out.println("- Decoded ---------");
    System.out.println(encodedData.readData());
  }
}
